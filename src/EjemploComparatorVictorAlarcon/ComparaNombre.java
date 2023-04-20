package EjemploComparatorVictorAlarcon;

import java.util.Comparator;

public class ComparaNombre implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Socio socio1= (Socio) o1;
        Socio socio2= (Socio) o2;

        return socio1.nombre.compareToIgnoreCase(socio2.nombre);
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}
