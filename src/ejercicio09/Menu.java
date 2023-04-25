package ejercicio09;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private Agenda agenda;

    public Menu(Agenda agenda) {
        this.agenda = agenda;
    }

    public void iniciar() {
        while (true) {
            System.out.println("""

                    Elija una opcion:
                    1 Crear un contacto
                    2 Buscar un contacto
                    3 Editar un contacto
                    4 Borrar un contacto
                    5 Mostrar agenda
                    6 Salir""");
            opcionesMenu();

        }
    }

    public void opcionesMenu() {
        int opcion = opcion();
        switch (opcion) {
            case 1 -> agenda.añadirContacto(new Contacto(pedirNombre(), pedirTelefono()));
            case 2 -> System.out.println(buscarContacto());
            case 3 -> editarContacto();
            case 4 -> borrarContacto();
            case 5 -> System.out.println(agenda);
            case 6 -> System.exit(0);
            default -> System.out.println("Error");
        }
    }

    private void borrarContacto() {
        Contacto cEliminado = buscarContacto();
        agenda.eliminar(cEliminado);
        System.out.println("Contacto Eliminado");
    }

    private void editarContacto(){
        Contacto cOld = buscarContacto();

        System.out.println("Editar:\n1 Nombre\n2 Telefono");
        int opcion = opcion();

        if (opcion == 1) {
            cOld.setNombre(pedirNombre());
            agenda.añadirContacto(cOld);
        }else {
            agenda.eliminar(cOld);
            agenda.añadirContacto(new Contacto(cOld.nombre(), pedirTelefono()));

        }
    }


    private Contacto buscarContacto() {
        System.out.println("Buscar por:\n1 Nombre\n2 Telefono");
        int opcion = opcion();

        if (opcion == 1) {
            return agenda.buscarNombre(buscarNombre());
        } else {
            return agenda.buscarTelefono(buscarTelefono());
        }

    }

    private String buscarNombre() {
        List<Contacto> contactos = agenda.listar();

        while (true) {
            String nombre = pedirNombre();
            for (Contacto c : contactos) {
                if (c.nombre().equalsIgnoreCase(nombre)) {
                    return nombre;
                }
            }
            System.out.println("El contacto no existe.");
        }
    }
    private String buscarTelefono() {
        List<Contacto> contactos = agenda.listar();

        while (true) {
            String telefono = pedirTelefono();
            for (Contacto c : contactos) {
                if (c.telefono().equalsIgnoreCase(telefono)) {
                    return telefono;
                }
            }
            System.out.println("El contacto no existe.");
        }
    }

    private String pedirNombre() {
        System.out.println("\nNombre: ");
        return in.nextLine();
    }

    private String pedirTelefono() {
        System.out.println("\nTelefono: ");
        return in.nextLine();
    }

    private int opcion() {
        int opcion = in.nextInt();
        in.nextLine();
        return opcion;
    }



    static Scanner in = new Scanner(System.in);
}
