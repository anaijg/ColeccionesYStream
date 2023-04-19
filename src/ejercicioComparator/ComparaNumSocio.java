package ejercicioComparator;

import java.util.Comparator;

public class ComparaNumSocio implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Socio s1 = (Socio) o1;
        Socio s2 = (Socio) o2;

        if (s1.idSocio < s2.idSocio) {
            return -1;
        } else if (s1.idSocio > s2.idSocio) {
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
