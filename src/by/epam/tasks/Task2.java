package by.epam.tasks;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task2 {

    public static int calculateDaysInMonth(int year, int month){
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, --month);

        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static boolean isLeapYear(int year) {
        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();

        return cal.isLeapYear(year);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.println("In the year " + year + ", in the " + month + "th month " +
                calculateDaysInMonth(year, month) + " days");

        System.out.println("Is leap year? - " + isLeapYear(year));
    }
}
