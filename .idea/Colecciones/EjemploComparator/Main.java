package Colecciones.EjemploComparator;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio(1, "Valentin", LocalDate.of(2001, 2, 8));
        Socio socio2 = new Socio(3, "Claudia", LocalDate.of(2002, 10, 17));
        Socio socio3 = new Socio(2, "Javier", LocalDate.of(1996, 10, 14));
        Socio socio4 = new Socio(4, "Victor", LocalDate.of(1991, 5, 10));


        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        impimirSocios(socios);

        // Comparamos las fechas de nacimiento
        // Instanciamos la clase

        ComparaFechaNac comparaFechaNac= new ComparaFechaNac();
        socios.sort(comparaFechaNac);
        System.out.println();
        impimirSocios(socios);
        socios.sort(comparaFechaNac.reversed());
        System.out.println();
        impimirSocios(socios);

        CompararNombre compararNombre = new CompararNombre();
        socios.sort(compararNombre);
        System.out.println();
        impimirSocios(socios);

        System.out.println();
        CompararId compararId = new CompararId();
        socios.sort(compararId);
        impimirSocios(socios);
    }

    private static void impimirSocios(ArrayList<Socio> socios) {
        for (Socio elementos: socios){
            System.out.println(elementos);
        }
    }
}
