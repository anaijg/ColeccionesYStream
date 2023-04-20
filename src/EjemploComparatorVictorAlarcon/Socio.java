package EjemploComparatorVictorAlarcon;

import java.time.LocalDate;

public class Socio {
    int idSocio;
    String nombre;
    LocalDate fechaNacimiento;

    public Socio(int idSocio, String nombre, LocalDate fechaNacimiento) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Socio nº" +
                "idSocio=" + idSocio +
                " nombre: " + nombre + ", fechaNacimiento " + fechaNacimiento ;
    }
}
