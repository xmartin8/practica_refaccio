package util;

public class Utils { // REFACT: Extracció de classe
    public static boolean isGreater(int a, int b) { // REFACT: Renaming i canvi d'algorítme
        return a > b;
    }//REFACT:Inline Code

    // Anterior codi
    // public static boolean max(int a, int b) {
    //     if (a > b) {
    //         return true;
    //     } else if (a == b) {
    //         return false;
    //     } else {
    //         return false;
    //     }
    // }

    public static void calculateQuadraticEquation(double a, double b, double c) { // REFACT: Renaming i canvi a la declaració de variables
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }
}
    // Anterior codi
    // public static void calcEquacioSegongrau(double a, double b, double c) {
    //     double D = b * b - 4 * a * c;
    //     if (D > 0) {
    //         double x1, x2;
    //         x1 = (-b - Math.sqrt(D)) / (2 * a);
    //         x2 = (-b + Math.sqrt(D)) / (2 * a);
    //         System.out.println("x1 = " + x1 + ", x2 = " + x2);
    //     }
    //     else if (D == 0) {
    //         double x;
    //         x = -b / (2 * a);
    //         System.out.println("x = " + x);
    //     }
    //     else {
    //         System.out.println("Equation has no roots");
    //     }
    // }
