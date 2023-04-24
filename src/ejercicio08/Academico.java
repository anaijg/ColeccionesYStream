package ejercicio08;

import java.time.LocalDate;
import java.time.LocalTime;

public class Academico {
    private String nombre;
    private LocalDate añoIngreso;

    public Academico(String nombre, String añoIngreso) {
        this.nombre = nombre;
        this.añoIngreso = LocalDate.parse(añoIngreso);
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate añoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(String añoIngreso) {
        this.añoIngreso = LocalDate.parse(añoIngreso);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", año de ingreso: " + añoIngreso;
    }
}
