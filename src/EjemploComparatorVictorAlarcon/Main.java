package EjemploComparatorVictorAlarcon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Socio socio1= new Socio(1,"valentin", LocalDate.of(2001,02,8));
        Socio socio2= new Socio(2,"claudia", LocalDate.of(2002,10,17));
        Socio socio3= new Socio(3,"Javier A", LocalDate.of(1996,10,14));
        Socio socio4= new Socio(4,"victor", LocalDate.of(1991,5,10));

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);
        System.out.println("Segun entran en el arraylist");
        imprimirSocios(socios);
        //ordenar por fecha de nacimiento
        //instanciamos la clase comparadora
        ComparaFechaNacimiento compara = new ComparaFechaNacimiento();
        // y ahora podemos ordenar pasando ese objeto al metodo sort
        System.out.println();
        socios.sort(compara);
        System.out.println("Ordenamos por fecha de nacimiento");
        imprimirSocios(socios);
        socios.sort(compara.reversed());
        System.out.println();
        System.out.println("Fecha nacimiento a la inversa");
        imprimirSocios(socios);
        System.out.println();

        ComparaNombre comparaNombre = new ComparaNombre();
        System.out.println("Ordena por nombre");
        socios.sort(comparaNombre);
        imprimirSocios(socios);
        System.out.println();
        System.out.println("Nombre a la inversa");
        socios.sort(comparaNombre.reversed());
        imprimirSocios(socios);

        ComparaIdSocio comparaIdSocio = new ComparaIdSocio();
        socios.sort(comparaIdSocio);
        System.out.println();
        System.out.println("Ordena por ID");
        imprimirSocios(socios);
        System.out.println();
        System.out.println("Ordena por ID a la inversa");
        socios.sort(comparaIdSocio.reversed());
        imprimirSocios(socios);
        System.out.println();

        menu(socios);

    }
    static void imprimirSocios(ArrayList<Socio> socios){
        for (Socio nuevoSocio: socios) {
            System.out.println(nuevoSocio);
        }
    }
    public static void menu(ArrayList<Socio> socios){
        ComparaNombre ordenNombre = new ComparaNombre();
        ComparaIdSocio ordenId = new ComparaIdSocio();
        ComparaFechaNacimiento ordenFechaNacimiento = new ComparaFechaNacimiento();
        int opcionAtributo = 0;
        int opcionOrden = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Porque Atributo quieres ordenarlo" + "\n 1.Por nombre" + "\n 2.Por ID "
                + "\n 3.Por fechaDeNacimiento");
        opcionAtributo= sc.nextInt();
        sc.nextLine();
        switch (opcionAtributo){
            case 1:
                System.out.println("Por nombre");
                break;
            case 2:
                System.out.println("Por ID");
                break;
            case 3:
                System.out.println("Por fecha de nacimiento");
        }

        System.out.println("En que orden quieres la ordenacion " + "\n 1.Ascendente " + "\n 2.Descendente" );
        opcionOrden = sc.nextInt();
            if (opcionAtributo==1&& opcionOrden==1){
                socios.sort(ordenNombre);
                imprimirSocios(socios);
            }else if (opcionAtributo==2 && opcionOrden==1){
                socios.sort(ordenId);
                imprimirSocios(socios);

            } else if (opcionAtributo==3 && opcionOrden==1) {
                socios.sort(ordenFechaNacimiento);
                imprimirSocios(socios);
            } else if (opcionAtributo==1&& opcionOrden==2) {
                socios.sort(ordenNombre.reversed());
                imprimirSocios(socios);
            } else if (opcionAtributo==2 && opcionOrden==2) {
                socios.sort(ordenId.reversed());
                imprimirSocios(socios);
            } else {
                socios.sort(ordenFechaNacimiento.reversed());
                imprimirSocios(socios);
            }

        }

    }

