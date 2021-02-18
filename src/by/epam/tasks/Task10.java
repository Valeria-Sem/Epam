package by.epam.tasks;

import java.util.Scanner;

public class Task10 {

    public static double calculateF(double x){
        return Math.tan(x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();

        System.out.printf("%-7s%-11s%n", "x", "F(x)");
        System.out.println("-----------------------");

        for(double x = a; x <= b; x += h){
            System.out.printf("%-7.2f%-11.2f%n", x, calculateF(x));
        }
    }
}
