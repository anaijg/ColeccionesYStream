package EjemploComparatorVictorAlarcon;

import java.util.Comparator;

public class ComparaFechaNacimiento implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        //lo primero es convertir los objetos a Socios
        Socio socio1= (Socio) o1;
        Socio socio2= (Socio) o2;
        // si socio1 nace antes que socio2 -> -1
        //si es al reves -> 1
        // si son iguales devuelve 0;
        if (socio1.fechaNacimiento.isBefore(socio2.fechaNacimiento)){
            return -1;
        } else if (socio1.fechaNacimiento.isAfter(socio2.fechaNacimiento)) {
            return +1;
        } else {
            return 0;
        }

    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}
