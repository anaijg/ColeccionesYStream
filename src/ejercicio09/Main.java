package ejercicio09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Menu menu = new Menu(agenda);
        menu.iniciar();


    }


}
