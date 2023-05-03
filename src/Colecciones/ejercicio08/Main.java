package Colecciones.ejercicio08;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Academico a1 = new Academico("Martina", "2022-04-21");
        Academico a2 = new Academico("Odin", "2018-04-21");
        Academico a3 = new Academico("Javi", "2010-04-21");
        Academico a4 = new Academico("Chanchito", "2014-04-21");
        Academico a5 = new Academico("Dante", "1995-04-21");
        Academico a6 = new Academico("Dante", "1997-04-21");

        Map<Character, Academico> realAcademia = new HashMap<>();
        nuevoAcademico(realAcademia, a1, 'z');
        nuevoAcademico(realAcademia, a2, 'L');
        nuevoAcademico(realAcademia, a3, 'a');
        nuevoAcademico(realAcademia, a4, 'F');
        nuevoAcademico(realAcademia, a5, 'D');
        nuevoAcademico(realAcademia, a6, 'j');

        System.out.println("Mapa sin  orden: " + realAcademia);


        //Creamos una lista a partir del mapa
        List<Map.Entry<Character, Academico>> mapaOrdenado = new ArrayList<>(realAcademia.entrySet());
        //Y ordenamos la lista por las claves
        mapaOrdenado.sort(Map.Entry.comparingByKey());

        System.out.println("\nMapa ordenado por clave: ");
        mapaOrdenado.forEach(System.out::println);

        //Guardamos el mapa en una lista omitiendo las claves
        List<Academico> academicos = new ArrayList<>(realAcademia.values());

        //Ordenamos la lista sin claves por el nombre del academico y si este coincide se usara el año de ingreso
        List<Academico> academicosOrdenadosPorNombreYfecha = academicos.stream()
                .sorted(Comparator.comparing(Academico::nombre)
                        .thenComparing(Academico::añoIngreso)).toList();

        System.out.println("\nLista ordenada por nombre y fecha: ");
        academicosOrdenadosPorNombreYfecha.forEach(System.out::println);

        //Guardamos el mapa en una lista ordenado por clave, nombre y fecha
        List<Map.Entry<Character, Academico>> mapaOrdenadoPorTodo = realAcademia.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Academico::nombre)
                        .thenComparing(Academico::añoIngreso))).toList();

        System.out.println("\nOrdenado por clave, y los 2 atributos");
        mapaOrdenadoPorTodo.forEach(System.out::println);





    }

    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        if (!comprobarLetra(letra) || academia.containsKey(letra)) {
            System.out.println("No se a podido");
            return false;
        }

        academia.put(letra, nuevo);
        return true;

    }

    static boolean comprobarLetra(Character letra) {
        return Character.isLetter(letra);
    }


}
