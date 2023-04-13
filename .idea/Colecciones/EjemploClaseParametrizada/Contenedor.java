package Colecciones.EjemploClaseParametrizada;

public class Contenedor<T> { // Cualquier tipo de dato
    private T objeto;
    public Contenedor() {}

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    public T extraer(){
        return objeto;
    }
}
