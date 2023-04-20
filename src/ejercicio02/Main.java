package ejercicio02;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();

        System.out.println("Sus numeros: " + numeros.numerosPositivos());
        System.out.println("Solo los pares: " + numeros.pares());
        numeros.rmMultiplos3();
        System.out.println("Los multiplos de 3 se han eliminado: " + numeros.numerosPositivos());
    }
}
