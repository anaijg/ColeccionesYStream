package Colecciones.ejercicio09;

import java.util.*;
import java.util.function.Predicate;

public class Agenda {
    //ATRIBUTOS
    protected HashMap<String, Contacto> contactos;

    //CONSTRUCTOR
    public Agenda() {
        contactos = new HashMap<>();
    }

    public String listaContactos() {
        List<Contacto> contactosOrdenados = ordenarPorNombre();
        StringBuilder sb = new StringBuilder("Contactos: \n");
        contactosOrdenados.forEach(contacto -> sb.append(contacto.nombre()).append(": ")
                .append(contacto.telefono())
                .append("\n"));
        return sb.toString();
    }

    //FUNCIONES
    public Contacto buscarContactoPorTelefono(String telefono) {

        return contactos.values()
                .stream()
                .filter(c -> c.telefono().equalsIgnoreCase(telefono))
                .findFirst()
                .get();
    }
    public Contacto buscarContactoPorNombre(String nombre) {
        return contactos.values()
                .stream()
                .filter(c -> c.nombre().equalsIgnoreCase(nombre))
                .findFirst()
                .get();
    }
    private List<Contacto> ordenarPorNombre() {
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
