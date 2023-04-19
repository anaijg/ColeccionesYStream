package colecciones.EjemploComparator;

import java.util.Comparator;

public class ComparafechaNacimiento  implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        // lo primero que tenemos que hacer es convertir los objetos a socio
        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;
        // si socio1 nace antes que socio2 -> -1
        // si es al rebes un -> 1
        // si son iguales devuelve 0

        if (socio1.fNacimiento.isBefore(socio2.fNacimiento)) {
            return -1;

        } else if (socio1.fNacimiento.isAfter(socio2.fNacimiento)) {
            return 1;
        } else {
            return 0;
        }
    }
}
