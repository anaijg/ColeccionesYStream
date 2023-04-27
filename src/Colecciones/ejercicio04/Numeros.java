package Colecciones.ejercicio04;

import java.util.ArrayList;
import java.util.List;

public class Numeros {
    //ATRIBUTOS
    private final int INICIO = 1;
    private final int FIN = 10;
    private final int CANTIDAD = 100;
    private List<Integer> numerosAleatorios;


    //CONSTRUCTOR
    public Numeros() {
        numerosAleatorios = new ArrayList<>();
        añadirNumeros();
    }

    //GETTER
    public List<Integer> numerosAleatorios() {
        return numerosAleatorios;
    }

    private void añadirNumeros(){
        for (int i = 0; i < CANTIDAD; i++) {
            numerosAleatorios.add(generarNum());
        }
    }

    private int generarNum() {
        return (int) (Math.random() * (FIN - INICIO + 1)) + INICIO;
    }

/*    public void eliminar5() {
        Iterator<Integer> iterador = numerosAleatorios.iterator();
        while (iterador.hasNext()) {
            Integer elemento = iterador.next();
            if (elemento == 5) {
                iterador.remove();
            }
        }
    }
*/
    public void eliminar5() {
        numerosAleatorios.removeIf(numero -> numero == 5);
    }
}
