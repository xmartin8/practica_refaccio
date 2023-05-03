import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        initMenu(); // REFACT: 1 extr metode
    }

    public static void printMenu() { // REFACT: 2
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("0. Acabar");
    }

    public static void initMenu() { // REFACT: 1
        Scanner scan = new Scanner(System.in);
        String p = "Proves";

        int opcio;
        do {
            printMenu(); // REFACT: 2 extr metode

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    initOp1_Num1BiggerThanNum2(scan); // REFACT: 7 extr metode
                    break;
                case 2:
                    /*
                    double a=2;
                    double b=3;
                    double c=1;
                    calcEquacioSegongrau(a, b, c);
                     */
                    // REFACT: 9 nom llegible (unifiquem nomenclatura opcions)
                    initOp2_calcEquacioSegongrau(2, 3, 1); // REFACT: 8 inline code
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
        } while (opcio != 0);
    }

    public static void initOp1_Num1BiggerThanNum2(Scanner scan) {
        int num1, num2; // REFACT: 3 declaracio variables
        String resposta;
        System.out.println("intro: ");
        //int num1 = scan.nextInt();
        num1 = scan.nextInt(); // REFACT: 3
        System.out.println("intro: ");
        //int num2 = scan.nextInt();
        num2 = scan.nextInt(); // REFACT: 3
        /*
        if (max(num1,num2)) {
            System.out.println("aaa"); // REFACT: 5
        }
        else System.out.println("bbb"); // REFACT: 6
        */
        // REFACT: 4 subst algoritme
        resposta = num1 + " NO és més gran que " + num2; // REFACT: 6 resposta inteligible
        if (max(num1,num2)) resposta = num1 + " és més gran que " + num2; // REFACT: 5 resposta inteligible
        System.out.println(resposta);
    }

    public static boolean max(int a, int b) {
        /*
        if(a > b) {
            return true;
        } else if (a == b) {
            return false;
        } else {
            return false;
        }
         */
        return a > b; // REFACT: 10 inline code i subst algoritme
    }

    public static void initOp2_calcEquacioSegongrau(double a, double b, double c) {
        double dinsArrel = b * b - 4 * a * c; // REFACT: 11 nom llegible
        String resposta; // REFACT: 12 extrac variable

        if (dinsArrel > 0) {
            double x1, x2;
            double arrelDiv = Math.sqrt(dinsArrel) / (2 * a); // REFACT: 13 extrac variable

            // x1 = (-b - Math.sqrt(dinsArrel)) / (2 * a);
            // x2 = (-b + Math.sqrt(dinsArrel)) / (2 * a);
            x1 = (-b - arrelDiv); // REFACT: 13
            x2 = (-b + arrelDiv); // REFACT: 13

            resposta= "x1 = " + x1 + ", x2 = " + x2; // REFACT: 12
        }
        else if (dinsArrel == 0) {
            double x;
            x = -b / (2 * a);
            resposta = "x = " + x;
        }
        else {
            resposta = "Equation has no roots"; // REFACT: 12
        }
        System.out.println(resposta); // REFACT: 12
    }
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
            return result
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

    public static class Order {
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
}