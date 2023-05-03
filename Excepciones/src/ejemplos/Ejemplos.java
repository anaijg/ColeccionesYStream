package ejemplos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejemplos {
    public static void main(String[] args) {
        //arrays
        String[] array = {"uno", "dos", "tres"};
        //System.out.println(array[9]); excepcion= java.lang.ArrayIndexOutOfBoundsException

        //dividir por 0
        int numerador = 5;
        int denominador = 0;
        //System.out.println(numerador/denominador); excepcion= java.lang.ArithmeticException

        //Scanner
        Scanner in = new Scanner(System.in);
        //int entero = in.nextInt(); si le metemos un valor que no sea int= java.util.InputMismatchException

        //ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        //arrayList.remove(10); excepcion= java.lang.ArrayIndexOutOfBoundsException



    }
}
