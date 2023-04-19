package Ejercicio12Jorge;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Libros> libreria = new ArrayList<>();
        Libros libro1 = new Libros("Lord Of The Rings", "1", 2002);
        Libros libro2 = new Libros("Lord Of The Rings 2", "2", 2003);
        Libros libro3 = new Libros("Lord Of The Rings 3", "3", 2004);

        libreria.add(libro1);
        libreria.add(libro2);
        libreria.add(libro3);
        libro1.prestar();

        Revistas revistas = new Revistas("Marca", "1", 2004, 2);
        Revistas revistas2 = new Revistas("Sport", "2", 2005, 3);

        System.out.println(revistas);
        System.out.println(revistas2);

        ArrayList<Publicacion> publicacions = new ArrayList<>();

        System.out.println(cuentaPrestado(libreria));

    }



    public static int cuentaPrestado(ArrayList<Libros> libreria){
        int prestados = 0;
        for (Libros comoQuieras: libreria
        ) {
            if (comoQuieras.prestado == true){
                prestados++;
            }
        }
        return prestados;
    }
    public static int publicacionesAnterioresA(ArrayList<Publicacion>publicaciones, int año){
        return 0;

    }
}