package Colecciones.ejercicioHotel;

import java.util.Scanner;

public enum Zona {
    PLAYA, MONTAÑA, RURAL;

    public static Boolean checkZona(String entrada) {
        return entrada.equalsIgnoreCase("PLAYA") || entrada.equalsIgnoreCase("MONTAÑA") || entrada.equalsIgnoreCase("RURAL");
    }

    static Zona pedirZona() {

        String texto = "Introduzca una zona (PLAYA, MONTAÑA o RURAL):";

        while (true) {
            System.out.println("\n" + texto);
            String respuesta = in.nextLine();
            if (Zona.checkZona(respuesta)) {
                return Zona.valueOf(respuesta.toUpperCase());

            }else {
                texto = "No es una zona válida, vuelva a intentarlo";
            }
        }
    }

    static Scanner in = new Scanner(System.in);
}
