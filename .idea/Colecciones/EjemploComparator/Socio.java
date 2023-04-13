package Colecciones.EjemploComparator;

import java.time.LocalDate;

public class Socio {
    int idSocion;
    String nombre;
    LocalDate FechaDeNacimiento;

    public Socio(int idSocion, String nombre, LocalDate fechaDeNacimiento) {
        this.idSocion = idSocion;
        this.nombre = nombre;
        FechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "idSocion = " + idSocion +
                ", nombre = " + nombre  +
                ", FechaDeNacimiento = " + FechaDeNacimiento;
    }
}
