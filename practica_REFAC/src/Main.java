import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String p = "Proves";

        int opcio;
        do {
            // REFACT 1 Tipo Extraccio de metode
            menu();
            /*
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0. Acabar");
             */

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    System.out.println("intro: ");
                    int num1 = scan.nextInt();
                    System.out.println("intro: ");
                    int num2 = scan.nextInt();
                    //Refactor 2 tipo extraccio de variable
                   final boolean MAX = max(num1, num2);
                    if (MAX) {
                        System.out.println("aaa");
                    }
                    /*
                    if (max(num1,num2)) {
                        System.out.println("aaa");
                    }
                     */
                    else System.out.println("bbb");
                    break;
                case 2:
                    double a=2;
                    double b=3;
                    double c=1;
                    calcEquacioSegongrau(a, b, c);
                    break;
                case 3:
                    List<OrderLineItems.OrderLineItem> lineItems = null;
                    Order asd = new Order(lineItems, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }
    //REFACT 3 Tipo inline code no se si aixo seria exactament inline code pero es el que mes s'hi acosta, ja que estic simplifcant code
    public static boolean max(int a, int b) {
        return a > b;
        /*
        if(a > b) {
            return true;
        } else {
            return false;
        }
        else if (a == b) {
            return false;
        } else {
            return false;
        }
        */
    }
    public static void calcEquacioSegongrau(double a, double b, double c) {
        //REFACT 4 Tipo variable temporal, ja que només emmagatzema un valor temporalment
        final double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            //Refact 5 Tipo variable temporal ja que esta fent una operacio i es guarda temporalment el resultat
           final double X = -b / (2 * a);
            System.out.println("x = " + X);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }
    //Refact 6 tipo Extract de metode de la classe order ja que es pot crear una classe independent per aquesta funcio
    /*
    public static class Human {
        private String name;
        private String age;
        private String country;
        private String city;
        private String street;
        private String house;
        private String quarter;
        public String obtenirAdrecaCompleta() {
            StringBuilder result = new StringBuilder();
            return result.append(country + ", " + city + ", " + street + ", " + house + " " + quarter).toString();
                  .append(country)
                  .append(", ")
                    .append(city)
                    .append(", ")
                    .append(street)
                    .append(", ")
                    .append(house)
                    .append(" ")
                    .append(quarter).toString();
        }
    }

     */
//Refact 7 tipo Extract de metode de la classe order ja que es pot crear una calsse independent per aquesta funcio
   /* public static class Order {
        private List<OrderLineItem> lineItems;
        private double taxRate;

        public Order(List<OrderLineItem> lineItems, double taxRate) {
            this.lineItems = lineItems;
            this.taxRate = taxRate;
        }

        public double calculateTotalPrice() {
            double subtotal = 0.0;
            for (OrderLineItem item : lineItems) {
                subtotal += item.getPrice();
            }
            double tax = subtotal * taxRate;
            return subtotal + tax;
        }
    }

    */
    //Refactor 8 tipo Extract de metode de la classe order ja que es pot crear una classe independent per aquesta funcio

    /*
    public class OrderLineItem {
        private String productName;
        private int quantity;
        private double price;

        public OrderLineItem(String productName, int quantity, double price) {
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }
        public double getPrice() {
            return price * quantity;
        }
    }
     */
//Refact 9 tipo Extract de metode de la classe order ja que es pot crear una classe independent per aquesta funcio
    /*
    public class Customer {
        private String firstName;
        private String lastName;

        public Customer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFullName() {
            return firstName + " " + lastName;

        }
    }

     */
    //Refact 1
    public static void menu(){
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("0. Acabar");
    }
}