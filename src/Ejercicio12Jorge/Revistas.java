package Ejercicio12Jorge;

public class Revistas extends Publicacion{
    private int numero;


    public Revistas(String titulo, String codigo, int añoPublicacion, int numero) {
        super(titulo, codigo, añoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Revistas{" +
                "numero=" + numero +
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