package ejercicioComparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Socio s1 = new Socio(1, "Pedro", LocalDate.of(2000, 10, 9));
        Socio s2 = new Socio(2, "Cristo", LocalDate.of(2002, 10, 9));
        Socio s3 = new Socio(3, "Judas", LocalDate.of(1990, 10, 9));

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(s1);
        socios.add(s2);
        socios.add(s3);

        System.out.println(socios);

        /*ComparaFN comparador = new ComparaFN();

        socios.sort(comparador);
        System.out.println(socios);

        socios.sort(comparador.reversed());
        System.out.println(socios);
*/
/*        ComparaNombre comparadorNombre = new ComparaNombre();
        socios.sort(comparadorNombre);
        System.out.println(socios);

        socios.sort(comparadorNombre.reversed());
        System.out.println(socios);*/

/*        ComparaNumSocio comparaID = new ComparaNumSocio();
        socios.sort(comparaID);
        System.out.println(socios);

        socios.sort(comparaID.reversed());
        System.out.println(socios);*/
        menu(socios);
    }

    public static void menu(ArrayList<Socio> socios) {
        System.out.println("Ordena por:\n\t1. Nombre\n\t2. ID\n\t3. Fecha de nacimiento");
        int opcion = in.nextInt();
        in.nextLine();

        System.out.println("Ordena de manera:\n\t1. Ascendente\n\t2. Descendente");
        int orden = in.nextInt();
        in.nextLine();

        System.out.println(ordenar(opcion, orden, socios));

    }

    public static ArrayList<Socio> ordenar(int opcion, int orden, ArrayList<Socio> socios) {
        Comparator comparaID = new ComparaNumSocio();
        Comparator comparaNombre = new ComparaNombre();
        Comparator comparaFN = new ComparaFN();

        switch (opcion) {
            case 1 :
                socios.sort(comparaNombre);
                break;
            case 2:
                socios.sort(comparaID);
                break;
            case 3:
                socios.sort(comparaFN);
                break;
        }

        if (orden == 2) {
            Collections.reverse(socios);
        }

        return socios;
    }
    static Scanner in = new Scanner(System.in);
}
