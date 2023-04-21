package ejercicioHotel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambdas {
    public static void main(String[] args) {
        List<Hotel> hoteles = Arrays.asList(
                new Hotel(1, Zona.PLAYA, 100),
                new Hotel(2, Zona.PLAYA, 90),
                new Hotel(3, Zona.PLAYA, 100),
                new Hotel(4, Zona.PLAYA, 150),
                new Hotel(5, Zona.PLAYA, 40),
                new Hotel(6, Zona.PLAYA, 70),
                new Hotel(7, Zona.PLAYA, 85),
                new Hotel(8, Zona.PLAYA, 66),
                new Hotel(9, Zona.MONTAÑA, 75),
                new Hotel(10, Zona.MONTAÑA, 94),
                new Hotel(11, Zona.RURAL, 56),
                new Hotel(12, Zona.RURAL, 45)
        );

        List<Hotel> hotelesZona = hoteles.stream()
                .filter(hotel -> hotel.zona().equals(Zona.pedirZona()))
                .toList();

        hotelesZona.forEach(System.out::println);


    }
}
