package Colecciones.ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosLambda {
    //ATRIBUTOS
    private List<Integer> numerosUsuario;

    //CONSTRUCTOR
    public NumerosLambda() {
        numerosUsuario = new ArrayList<>();
        pedirNumeros();

    }

    //GETTER
    public List<Integer> getNumerosUsuario() {
        return numerosUsuario;
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
            } else if (numero != 0) {
                numerosUsuario.add(numero);
            } else{
                texto = "Eso no es un número real, vuelve a intentarlo.";
            }
        }
    }



    static Scanner in = new Scanner(System.in);
}
