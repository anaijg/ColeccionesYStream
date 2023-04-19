package Ejercicio12Jorge;

public class Libros extends Publicacion implements Prestable{
    protected boolean prestado;

    public Libros(String titulo, String codigo, int añoPublicacion) {
        super(titulo, codigo, añoPublicacion);
        this.prestado = false;
    }



    public void prestar() {
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean prestado() {
        return prestado;
    }


    @Override
    public String toString() {
        return "Libros{" +
                "prestado=" + prestado +
                ", titulo='" + titulo + '\'' +
                ", codigo='" + codigo + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                '}';
    }
    public int añoPublicacion(){
        return añoPublicacion;
    }

    public String codigo(){
        return codigo;
    }

}