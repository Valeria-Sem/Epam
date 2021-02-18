package by.epam.tasks;

import java.util.Scanner;

public class Task3 {

    public static double getAreaOfSquare(double square){
        double squareSide = Math.sqrt(square);
        double radius = squareSide / 2;
        double inscribedSquare = 0.5 * Math.pow(radius, 2) * 4;

        return inscribedSquare;
    }

    public static double getDeltaSquare(double givenSquare, double inscribedSquare){
        return givenSquare / inscribedSquare;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area of given square: ");
        double givenSquare = scanner.nextDouble();

        double inscribedSquare = getAreaOfSquare(givenSquare);
        System.out.println("The area of square = " + inscribedSquare);
        System.out.println("Еhe difference in the areas of the squares is equal to = "
                + getDeltaSquare(givenSquare, inscribedSquare));
    }
}
