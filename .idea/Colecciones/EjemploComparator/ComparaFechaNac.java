package Colecciones.EjemploComparator;

import java.util.Comparator;

public class ComparaFechaNac implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        // Lo primero que vamos a hacer es convertir los objetos a Socios
        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;
        // Si el socio 1 nace antes que socio 2 → -1
        // Si el socio 1 nace después que socio 2 → +1
        // Si el socio 1 nace a la vez que socio 2 -> 0
        if (socio1.FechaDeNacimiento.isBefore(socio2.FechaDeNacimiento)) {
            return -1;
        } else if (socio1.FechaDeNacimiento.isAfter(socio2.FechaDeNacimiento)) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}
