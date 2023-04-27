package ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemplosConExcepciones {
    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);
        //int entero = in.nextInt(); si le metemos un valor que no sea int= java.util.InputMismatchException
        /* try {
            int entero = in.nextInt();
        } catch (InputMismatchException datoErroneo) {
            datoErroneo.printStackTrace();
            datoErroneo.getMessage();
            System.out.println("Dato invalido");
        } catch (Exception e) {
            System.out.println("Excepcion inesperada");
            System.out.println(e.getMessage());
        }*/

        //ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        //arrayList.remove(10); excepcion= ArrayIndexOutOfBoundsException

        boolean valido = true;
        while (valido) {

            System.out.println("0 para salir");

            int num = 1;
            try {
                num = in.nextInt();
            } catch (Exception e) {
                System.out.println("Ni siquiera has puesto un numero ceporro");
                in.nextLine();
            }finally {
                valido = num == 0 ? false : true;
            }


        }




    }
}
