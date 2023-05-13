package menu;

import order.Order;
import order.OrderLineItem;
import util.Utils;

import java.util.List;
import java.util.Scanner;

public class Menu { // REFACT: Extracció de classe
    public void mostraMenu(Scanner scan) {
        int option;
        do {
            System.out.println("1.Comproveu si un número és màxim ");
            System.out.println("2.Calculeu l'equació de segon grau ");
            System.out.println("3.Crear una ordre "); //REFACT:Treiem codi no utilitzat
            System.out.println("0. Acabar");

            option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1:
                    System.out.println("intro: ");
                    int num1 = scan.nextInt();
                    System.out.println("intro: ");
                    int num2 = scan.nextInt();
                    if (Utils.isGreater(num1, num2)) { // REFACT: Renaming i canvi de la resposta, no es clara
                        System.out.println(num1+" és més gran que "+num2);
                    } else if (num1==num2){
                        System.out.println(num1+" és el mateix numero que "+num2);
                    }else   System.out.println(num2+" és més gran que "+num1);
                    break;
                case 2:
                    Utils.calculateQuadraticEquation(2, 3, 1); // REFACT: Renaming i Inline Code
                    break;
                case 3:
                    List<OrderLineItem> lineItems = null;
                    Order asd = new Order(lineItems, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (option != 0);
    }
}
