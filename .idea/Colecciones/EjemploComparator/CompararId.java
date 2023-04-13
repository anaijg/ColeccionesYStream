package Colecciones.EjemploComparator;

import java.util.Comparator;

public class CompararId implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;
        if (socio1.idSocion < socio2.idSocion) {
            return -1;
        } else if (socio1.idSocion > socio2.idSocion) {
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
