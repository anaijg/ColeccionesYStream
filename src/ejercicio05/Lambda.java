package ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        NumerosLambda numerosLambda = new NumerosLambda();
        List<Integer> numeros = new ArrayList<>(numerosLambda.getNumerosUsuario());

        List<Integer> numerosPositivos = numerosPositivos(numeros);
        System.out.println("Numeros positivos: " + numerosPositivos);

        List<Integer> numerosNegativos = numerosNegativos(numeros);
        System.out.println("\nNumeros negativos: " + numerosNegativos);

        numerosPositivos.removeIf(n -> n > 10);
        numerosNegativos.removeIf(n -> n < -10);

        System.out.println("\nNumeros positivos menores de 10: " + numerosPositivos);
        System.out.println("\nNumeros negativos mayores de -10: " + numerosNegativos);




    }

    public static List<Integer> numerosPositivos(List<Integer> numeros) {
        return new ArrayList<>(numeros.stream()
                .filter(n -> n > 0)
                .toList());
    }

    public static List<Integer> numerosNegativos(List<Integer> numeros) {
        return new ArrayList<>(numeros.stream()
                .filter(n -> n < 0)
                .toList());

    }
}

