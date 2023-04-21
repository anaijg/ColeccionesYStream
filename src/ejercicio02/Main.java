package ejercicio02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();

        List<Integer> numerosList = new ArrayList<>(numeros.numerosPositivos());

        System.out.println(numerosList);

        List<Integer> numerosListPares = numerosList.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(numerosListPares);
    }
}
