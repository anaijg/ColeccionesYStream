package Colecciones.ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numeros {
    //ATRIBUTOS
    private List<Integer> numerosPositivos;
    private List<Integer> numerosNegativos;

    //CONSTRUCTOR
    public Numeros() {
        numerosNegativos = new ArrayList<>();
        numerosPositivos = new ArrayList<>();
        pedirNumeros();

    }

    //GETTER
    public List<Integer> numerosPositivos() {
        return numerosPositivos;
    }

    public List<Integer> numerosNegativos() {
        return numerosNegativos;
    }

    //FUNCIONES
    private void pedirNumeros() {
        String texto = "Introduce números reales, 0 para salir: ";
        while (true) {
            System.out.println(texto);
            int numero = in.nextInt();
            in.nextLine();

            if (numero == 0) {
                break;
            } else if (numero > 0) {
                numerosPositivos.add(numero);
            }else if(numero < 0){
                numerosNegativos.add(numero);
            }else{
                texto = "Eso no es un número real, vuelve a intentarlo.";
            }
        }
    }



    static Scanner in = new Scanner(System.in);
}
