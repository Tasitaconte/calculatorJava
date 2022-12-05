package app;

import java.util.Scanner;
import interfaces.Ioperation;
import interfaces.Doperation;
import controlador.appController;

public class app {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        Ioperation ioperation = new Doperation();
        appController appController = new appController();

        appController.menu();

        do {
            // catch data to option variable
            char option = Scanner.nextLine().toLowerCase().charAt(0);

            switch (option) {
                case 'a':
                    // do sum
                    System.out.println(ioperation.suma(5, 4));
                    break;
                case 'b':
                    // do rest
                    System.out.println(ioperation.rest(5, 4));
                    break;
                case 'c':
                    // do division
                    System.out.println(ioperation.division(5, 4));
                    break;
                case 'd':
                    // do multiplication
                    System.out.println(ioperation.multiplication(5, 4));
                    break;
                case 'e':
                    // ends code
                    System.exit(0);
                default:
                    System.out.println("try again");
                    break;
            }
        } while (true);
    }
}