package ejercicio09;

import java.util.*;

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
        if (contactos.containsKey(telefono)) {
            return contactos.get(telefono);
        } else {
            System.out.println("El contacto no existe");
            return null;
        }
    }
    public Contacto buscarContactoPorNombre(String nombre) {
        for (Map.Entry<String, Contacto> mapa : contactos.entrySet()) {
            if (mapa.getValue().nombre().equalsIgnoreCase(nombre)) {
                return mapa.getValue();
            }
        }
        System.out.println("El contacto no existe");
        return null;
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
