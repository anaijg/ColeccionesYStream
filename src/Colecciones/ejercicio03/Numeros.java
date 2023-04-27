package Colecciones.ejercicio03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Numeros {
    //ATRIBUTOS
    private List<Integer> numerosAleatorios;
    private final int CANTIDAD = 20;
    private final int INICIO = 1;
    private final int FIN = 10;

    //CONSTRUCTOR
    public Numeros() {
        numerosAleatorios = new ArrayList<>();
        añadirAleatorios();
    }

    //GETTER
    public List<Integer> numerosAleatorios() {
        return numerosAleatorios;
    }

    private void añadirAleatorios() {
        for (int i = 0; i < CANTIDAD; i++) {
            numerosAleatorios.add(generarAleatorio());
        }
    }

    private int generarAleatorio() {
        return (int) (Math.random() * (FIN - INICIO + 1)) + INICIO;
    }

    /**
     * Metemos la Lista en un HashSet y eliminamos automaticamente los repetidos
     * @return
     */
    public HashSet<Integer> eliminarRepetidos() {
        return new HashSet<>(numerosAleatorios);

    }
}
