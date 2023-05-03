package Colecciones.ejercicio09;

public class Contacto {
    //ATRIBUTOS
    private String nombre;
    private String telefono;

    //CONSTRUCTOR
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //GETTERS Y SETTERS
    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String telefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nTelefono: " + telefono;
    }

    //FUNCIONES

}
