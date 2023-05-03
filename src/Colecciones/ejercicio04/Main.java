package Colecciones.ejercicio04;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        System.out.println("Numeros originales:\n" +numeros.numerosAleatorios());
        numeros.eliminar5();
        System.out.println("\nNumeros sin el 5:\n" +numeros.numerosAleatorios());
    }
}
