package Lambda.ejercicio01;

public class Ejercicio01 {
    public static void main(String[] args) {
        //int resultado = determinarSigno(-30);
        Signo s = num -> {
            return Integer.compare(num, 0);
        };
        System.out.println(s.determinarSigno(30));

        Print p = arg -> "\"" + arg + "\"";
        System.out.println(p.print("Hola"));

        GetPrimeroYUltimo gpu = array -> new int[]{array[0], array[array.length-1]};


    }

    private static int determinarSigno(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static String print(String arg) {
        return "\"" + arg + "\"";
    }

    public static int[] getPrimeroyUltimo(int[] array) {
        return new int[]{array[0], array[array.length-1]};
    }


}
