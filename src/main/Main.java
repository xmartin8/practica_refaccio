package main;

import menu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu(); // REFACT: Extracció de classe
        menu.mostraMenu(scan);
    }
}

// Anterior codi
        // int opcio;
        // do {
        //     System.out.println(""1. Comproveu si un número és màxim");
        //     System.out.println("2. Calculeu l'equació de segon grau");
        //     System.out.println("3. Crear una ordre");
        //     System.out.println("4. ");
        //     System.out.println("5. ");
        //     System.out.println("0. Acabar");
        //     opcio = scan.nextInt();
        //     scan.nextLine();
        //     switch (opcio) {
        //         case 1:
        //             System.out.println("intro: ");
        //             int num1 = scan.nextInt();
        //             System.out.println("intro: ");
        //             int num2 = scan.nextInt();
        //             if (util.Utils.max(num1, num2)) {
        //                 System.out.println("aaa");
        //             } else {
        //                 System.out.println("bbb");
        //             }
        //             break;
        //         case 2:
        //             util.Utils.calcEquacioSegongrau(2, 3, 1);
        //             break;
        //         case 3:
        //             List<order.OrderLineItem> lineItems = null;
        //             order.Order asd = new order.Order(lineItems, 5.5);
        //             break;
        //         case 0:
        //             break;
        //         default:
        //             System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
        //     }
        // } while (opcio != 0);

