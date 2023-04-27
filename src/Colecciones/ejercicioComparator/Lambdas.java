package Colecciones.ejercicioComparator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<Socio> socios = Arrays.asList(
                new Socio(2, "Pedro", LocalDate.of(2000, 10, 9)),
                new Socio(1, "Cristo", LocalDate.of(2002, 10, 9)),
                new Socio(3, "Judas", LocalDate.of(1990, 10, 9))
        );

        System.out.println(socios);

        List<Socio> sociosOrdenados = socios.stream()
                .sorted(Comparator.comparingInt(Socio::idSocio))
                .toList();

        System.out.println(sociosOrdenados);
    }
}
