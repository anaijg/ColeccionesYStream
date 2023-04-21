package ejercicio04;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numerosAleatorios = new ArrayList<>(new Random()
                .ints(100, 1, 11)
                .boxed()
                .toList());

        System.out.println("Numeros originales: " + numerosAleatorios);

        numerosAleatorios.removeIf(n -> n == 5);

        System.out.println("\nNumeros sin el 5: " + numerosAleatorios);

        //Crear lista sin los numeros == 5
//        List<Integer> eliminarNum5 = numerosAleatorios.stream()
//                .filter(n -> n != 5)
//                .toList();
//        System.out.println("\nNumeros sin el 5: " + eliminarNum5);

    }
}
