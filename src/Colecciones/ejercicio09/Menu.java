package Colecciones.ejercicio09;

import java.util.*;
import java.util.function.Predicate;

public class Menu extends Agenda{
    ArrayList<Integer> OPCIONES_MENU = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    ArrayList<Integer> OPCIONES_BUSCAR = new ArrayList<>(Arrays.asList(1, 2));



    public Menu() {
        super();

    }

    public void iniciar() {
        while (true) {

            int opcion;
            do {
                System.out.println("""

                    Elija una opcion:
                    1 Crear un contacto
                    2 Buscar un contacto
                    3 Editar un contacto
                    4 Borrar un contacto
                    5 Mostrar agenda
                    6 Salir""");
                opcion = opcion();
            } while (!OPCIONES_MENU.contains(opcion));
            opcionesMenu(opcion);

        }
    }

    public void opcionesMenu(int opcion) {

        switch (opcion) {
            case 1 -> añadirContacto(new Contacto(pedirNombre(), pedirTelefono()));
            case 2 -> System.out.println(buscarContacto());
            case 3 -> editarContacto();
            case 4 -> borrarContacto();
            case 5 -> System.out.println(listaContactos());
            case 6 -> System.exit(0);
            default -> System.out.println("Error");
        }
    }

    private void borrarContacto() {
        try {
            Contacto cEliminado = buscarContacto();
            eliminar(cEliminado);
            System.out.println("Contacto Eliminado");

        } catch (NullPointerException e) {
            iniciar();
        }
    }

    private void editarContacto(){

        try {
            Contacto cOld = buscarContacto();


            int opcion;
            do {
                System.out.println("Editar:\n1 Nombre\n2 Telefono");
                opcion = opcion();
            } while (!OPCIONES_BUSCAR.contains(opcion));

            if (opcion == 1) {
                cOld.setNombre(pedirNombre());
                añadirContacto(cOld);
            }else {
                eliminar(cOld);
                añadirContacto(new Contacto(cOld.nombre(), pedirTelefono()));

            }

        } catch (NullPointerException e) {
            iniciar();
        }


    }


    private Contacto buscarContacto() {
        int opcion;
        do {
            System.out.println("Buscar por:\n1 Nombre\n2 Telefono");
            opcion = opcion();

        } while (!OPCIONES_BUSCAR.contains(opcion));

        if (opcion == 1) {

            try {
                return buscarContactoPorNombre(pedirNombre());
            } catch (NoSuchElementException e) {
                System.out.println("El contacto no existe");
            }

        } else {

            try {
                return buscarContactoPorTelefono(pedirTelefono());
            } catch (NoSuchElementException e) {
                System.out.println("El contacto no existe");
            }
        }
        return null;
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
        int opcion = 0;
        do {
            try {
                opcion = in.nextInt();
                in.nextLine();
                return opcion;

            } catch (InputMismatchException e) {
                System.out.println("Dato no valido");
                in.nextLine();
            }

        } while (opcion > 0);
        return opcion;
    }

    static Scanner in = new Scanner(System.in);
}
