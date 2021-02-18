package by.epam.tasks;

import java.util.Scanner;

public class Task8 {

    public static double calculateFunction(double x){
        double F;

        if(x >= 3){
            F = Math.pow(-x, 2) + 3 * x + 9;
        } else{
            F = 1 / (Math.pow(x, 3) - 9);
        }

        return F;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        System.out.println(calculateFunction(x));
    }
}
