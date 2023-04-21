package ejercicioComparator;

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

    public int idSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate fechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "\nSocio{" +
                "idSocio=" + idSocio +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

}
