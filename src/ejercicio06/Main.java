package ejercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numreosUsuario = new ArrayList<>(pedirNumeros());
        numreosUsuario.stream()
                .filter(n -> n % 2 == 0)
                .map(e -> numreosUsuario.indexOf(e) * 100)
                .forEach(System.out::println);

    }

    public static List<Integer> pedirNumeros() {
        List<Integer> numerosUsuario = new ArrayList<>();
        String texto = "Introduce números positivos, negativo para salir: ";
        while (true) {
            System.out.println(texto);
            int numero = in.nextInt();
            in.nextLine();

            if (numero < 0) {
                break;
            } else if (numero >= 0) {
                numerosUsuario.add(numero);
            } else {
                texto = "Eso no es un número, vuelva a intentarlo.";
            }
        }
        return numerosUsuario;
    }

    static Scanner in = new Scanner(System.in);
}
