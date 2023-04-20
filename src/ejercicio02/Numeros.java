package ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numeros {
    private ArrayList<Integer> numerosPositivos;

    public Numeros() {
        pedirNumeros();
    }

    public ArrayList<Integer> numerosPositivos() {
        return numerosPositivos;
    }

    private void pedirNumeros() {
        numerosPositivos = new ArrayList<>();

        String texto = "Introduce numeros positivos, -1 para salir";
        while (true) {
            System.out.println(texto);
            int num = in.nextInt();
            in.nextLine();

            if (num >= 0) {
                numerosPositivos.add(num);
            }else {
                break;
            }
        }
    }

    public ArrayList<Integer> pares() {
        return numerosPositivos.stream().filter(n -> n % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    public void rmMultiplos3() {
        numerosPositivos.removeIf(n -> n % 3 == 0);
    }

    static Scanner in = new Scanner(System.in);
}
