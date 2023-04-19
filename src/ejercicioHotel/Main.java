package ejercicioHotel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel h1 = new Hotel(1, Zona.PLAYA, 100);
        Hotel h2 = new Hotel(2, Zona.PLAYA, 90);
        Hotel h3 = new Hotel(3, Zona.PLAYA, 100);
        Hotel h4 = new Hotel(4, Zona.PLAYA, 150);
        Hotel h5 = new Hotel(5, Zona.PLAYA, 40);
        Hotel h6 = new Hotel(6, Zona.PLAYA, 70);
        Hotel h7 = new Hotel(7, Zona.PLAYA, 85);
        Hotel h8 = new Hotel(8, Zona.PLAYA, 66);
        Hotel h9 = new Hotel(9, Zona.MONTAÑA, 75);
        Hotel h10 = new Hotel(10, Zona.MONTAÑA, 94);
        Hotel h11 = new Hotel(11, Zona.RURAL, 56);
        Hotel h12 = new Hotel(12, Zona.RURAL, 45);


        HashSet<Hotel> hoteles = new HashSet<>();

        hoteles.add(h8);
        hoteles.add(h4);
        hoteles.add(h5);
        hoteles.add(h7);
        hoteles.add(h6);
        hoteles.add(h1);
        hoteles.add(h3);
        hoteles.add(h2);
        hoteles.add(h9);
        hoteles.add(h10);
        hoteles.add(h11);
        hoteles.add(h12);

        //imprimo la coleccion HashSet
        imprimirHash(hoteles);
        Zona zonaElegida = Zona.pedirZona();

        ArrayList<Hotel> hoteles2 = Hotel.buscar(zonaElegida, hoteles);

        Comparator comparar = (Object o1, Object o2) -> {
            Hotel hotel1 = (Hotel) o1;
            Hotel hotel2 = (Hotel) o2;

            return Integer.compare(hotel1.precio(), hotel2.precio());
        };



        hoteles2.sort(comparar);
        imprimirArr(hoteles2);



    }
    static void imprimirHash(HashSet<Hotel> hoteles) {
        for (Hotel h : hoteles) {
            System.out.println(h);
        }
    }

    static void imprimirArr(ArrayList<Hotel> hoteles) {
        for (Hotel h : hoteles) {
            System.out.println(h);
        }
    }



}
