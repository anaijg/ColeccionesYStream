package Colecciones.ejemplosLambda;

public class Ejemplo1 {
    public static void main(String[] args) {
        Ejemplo1 ejemplo1 = new Ejemplo1();
        ejemplo1.ejemplo01(12);

        Lambda ld = n -> n % 2 == 0;

        System.out.println("4 es impar: " + ld.validaImpar(7));
    }


    public boolean ejemplo01(int n) {
        return n % 2 == 0;
    }



    public boolean ejemplo2(Character c) {
        return c == 'y';
    }

    public double ejemplo3(double x, double y) {
        return x + y;
    }

    public int ejemplo4(int a, int b) {
        return a * a + b * b;
    }

    public int ejemplo5() {
        return 42;
    }

    public double ejemplo6() {
        return Math.PI;
    }

    public void ejemplo7(String s) {
        System.out.println(s);
    }

    public void ejemplo8() {
        System.out.println("Hola, mundo.");
    }

}
