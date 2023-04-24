package ejercicio09;

import java.util.*;

public class Agenda {
    //ATRIBUTOS
    private HashMap<String, Contacto> contactos;

    //CONSTRUCTOR
    public Agenda() {
        contactos = new HashMap<>();
    }

    @Override
    public String toString() {
        List<Contacto> contactosOrdenados = listar();
        StringBuilder sb = new StringBuilder("Contactos: \n");
        contactosOrdenados.forEach(contacto -> sb.append(contacto.nombre()).append(": ")
                .append(contacto.telefono())
                .append("\n"));
        return sb.toString();
    }

    //FUNCIONES
    public Contacto buscarTelefono(String telefono) {
        return contactos.get(telefono);
    }
    public Contacto buscarNombre(String nombre) {
        for (Contacto c : contactos.values()) {
            if (c.nombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        System.out.println("Contacto invalido");
        return null;
    }
    public List<Contacto> listar() {
        List<Contacto> contactoList = new ArrayList<>(contactos.values());
        contactoList.sort(Comparator.comparing(Contacto::nombre));
        return contactoList;
    }
    
    public void añadirContacto(Contacto c) {
        contactos.put(c.telefono(), c);
        System.out.println("Contacto guardado");
    }

    public void eliminar(Contacto contacto) {
        contactos.remove(contacto.telefono());
    }



}
