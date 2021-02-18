package by.epam.tasks;

import java.util.Scanner;

public class Task1 {

    public static int calculateSquareOfLastDigit (int numb){
        int lastDigit = numb % 10;

        return (int)(Math.pow(lastDigit, 2) % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");

        int number = scanner.nextInt();

        System.out.println("Square of the last digit of number = " + calculateSquareOfLastDigit(number));
    }
}
