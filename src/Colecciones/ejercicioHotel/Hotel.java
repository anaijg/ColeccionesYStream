package Colecciones.ejercicioHotel;

import java.util.ArrayList;
import java.util.HashSet;

public class Hotel {
    private int idHotel;
    private Zona zona;
    private int precio;

    public Hotel(int idHotel, Zona zona, int precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        establecerPrecio(precio);
    }

    public int idHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public Zona zona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public int precio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    private void establecerPrecio(int precio){
        if (40 <= precio && precio <= 150) {
            this.precio = precio;
        }else {
            this.precio = 40;
            System.out.println("Precio no valido, se le asignara 40");
        }
    }

    @Override
    public String toString() {
        return "Hotel: " + idHotel +
                ", zona: " + zona +
                ", precio: " + precio +
                '}';
    }

    public static ArrayList<Hotel> buscar(Zona zona, HashSet<Hotel> hoteles) {
        ArrayList<Hotel> hotelArrayList = new ArrayList<>();

        for (Hotel h : hoteles) {
            if (h.zona.equals(zona)) {
                hotelArrayList.add(h);
            }
        }
        return hotelArrayList;
    }
}
