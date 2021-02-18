package by.epam.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {

    public static boolean isPositiveNumbers(List<Integer> sequence){
        int count = 0;
        boolean isPositive = false;

        for(int seq: sequence){
            if (seq % 2 == 0)
                count++;
        }

        if (count >= 2)
            isPositive = true;

        return isPositive;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D;

        System.out.print("Enter A : ");
        A = scanner.nextInt();
        System.out.print("Enter B : ");
        B = scanner.nextInt();
        System.out.print("Enter C : ");
        C = scanner.nextInt();
        System.out.print("Enter D : ");
        D = scanner.nextInt();

        List<Integer> sequence = new ArrayList<>();
        sequence.add(A);
        sequence.add(B);
        sequence.add(C);
        sequence.add(D);

        System.out.print(isPositiveNumbers(sequence));
    }
}
