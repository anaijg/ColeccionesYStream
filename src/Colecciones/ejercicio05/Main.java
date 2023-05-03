package Colecciones.ejercicio05;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();

        System.out.println("Numeros positivos:\n" + numeros.numerosPositivos());
        System.out.println("Numeros negativos:\n" + numeros.numerosNegativos());

        int sumaPositivos = numeros.numerosPositivos().stream().mapToInt(Integer::intValue).sum();

        int sumaNegativos = numeros.numerosNegativos().stream().mapToInt(Integer::intValue).sum();

        System.out.println("Suma de numeros positivos: " + sumaPositivos);
        System.out.println("Suma de numeros negativos: " + sumaNegativos);

        numeros.numerosPositivos().removeIf(numero -> numero > 10);
        numeros.numerosNegativos().removeIf(numero -> -10 > numero);

        System.out.println("Numeros positivos menores de 10: " + numeros.numerosPositivos());
        System.out.println("Numeros negativos menores de -10: " + numeros.numerosNegativos());

    }
}
