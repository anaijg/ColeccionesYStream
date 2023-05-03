package Lambda.ejercicio02;

import java.lang.String;

public class Ejercicio02 {
    //Crea una lista de Strings y utiliza una expresión lambda para imprimir cada elemento de la lista.

    public static void main(String[] args) {
        String[] array = {"Hola", "Que", "Tal"};

        String2 string = array1 -> {
            for (String s : array1) {
                System.out.println(s);
            }
        };

        string.imprimir(array);
    }
}
