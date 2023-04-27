package Colecciones.ejercicio03;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numerosAleatorios = new Random()
                .ints(20, 1, 11)
                .boxed()
                .toList();

        System.out.println("Numeros originales: " + numerosAleatorios);

        HashSet<Integer> eliminarRepetidos = new HashSet<>(numerosAleatorios);

        System.out.println("Numeros sin repetir: " + eliminarRepetidos);
    }
}
