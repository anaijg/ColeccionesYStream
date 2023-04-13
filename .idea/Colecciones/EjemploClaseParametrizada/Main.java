package Colecciones.EjemploClaseParametrizada;
public class Main {
    public static void main(String[] args) {
        // Creamos un contenedor para guardar un tipo de dato = int
        Contenedor<Integer> numero = new Contenedor<>();
        System.out.println(numero.extraer());
        numero.guardar(123);
        System.out.println(numero.extraer());
        // Creamos un contenedor para guardar un tipo de dato = String
        Contenedor<String> stringContenedor = new Contenedor<>();
        System.out.println(stringContenedor.extraer());
        stringContenedor.guardar("abc");
        System.out.println(stringContenedor.extraer());
    }
}