package by.epam.tasks;

import java.util.Scanner;

public class Task7 {

    public static double calculatePointCoordinates(double x, double y){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void main(String[] args) {
        double x1, x2, y1, y2;
        double A, B;

        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        A = calculatePointCoordinates(x1, y1);
        B = calculatePointCoordinates(x2, y2);

        if(A < B){
            System.out.println("Point A is nearer");
        } else if (A > B){
            System.out.println("Point B is nearer");
        } else {
            System.out.println("Points A and B at the same distance");
        }
    }
}
