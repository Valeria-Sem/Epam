package by.epam.tasks;

import java.util.Scanner;

public class Task9 {

    public static double calculateAreaOfCircle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateLengthOfCircle(double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("The area of a circle" + calculateAreaOfCircle(radius));
        System.out.println("The length of a circle" + calculateLengthOfCircle(radius));
    }
}
