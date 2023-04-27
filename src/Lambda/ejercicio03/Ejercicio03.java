package Lambda.ejercicio03;

public class Ejercicio03 {
    public static void main(String[] args) {
        //Crea una lista de Strings y utiliza una expresión lambda para contar cuántas palabras
        //tienen más de 5 caracteres.
        String[] array = {"Hola", "Que", "Tal", "Martina"};

        Ej03 ej = array1 -> {
            int contar = 0;
            for (String s : array1) {
                contar += (s.length() > 5) ? 1 : 0;
            }
            return contar;
        };

        System.out.println("Hay " + ej.ej03(array) + " palabras con más de 5 caracteres");

    }
}
