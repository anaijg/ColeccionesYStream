package ejercicio07;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numerosAleatorios = new Random()
                .ints(20, 1, 11)
                .boxed()
                .toList();

        Set<Integer> numerosSinRepetir = new HashSet<>(numerosAleatorios);

        Set<Integer> numRepetidos = numerosAleatorios.stream()
                .filter(i -> Collections.frequency(numerosAleatorios, i) > 1)
                .collect(Collectors.toSet());

        Set<Integer> solo1vez = numerosAleatorios.stream()
                .filter(i -> Collections.frequency(numerosAleatorios, i) == 1)
                .collect(Collectors.toSet());

        System.out.println("Numeros aleatorios originales: " + numerosAleatorios);
        System.out.println("\nNumeros sin repetir: " + numerosSinRepetir);
        System.out.println("\nNumeros repetidos: " + numRepetidos);
        System.out.println("\nNumeros que solo aparecen 1 vez: " + solo1vez);


    }
}
