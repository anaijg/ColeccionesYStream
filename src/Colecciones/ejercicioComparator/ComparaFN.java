package Colecciones.ejercicioComparator;

import java.util.Comparator;

public class ComparaFN implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;

        if (socio1.fechaNacimiento.isBefore(socio2.fechaNacimiento)) {
            return -10;
        } else if (socio1.fechaNacimiento.isAfter(socio2.fechaNacimiento)) {
            return 20;
        } else {
            return 0;
        }
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}
