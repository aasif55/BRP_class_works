package Day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter a year: ");
        Scanner s1 = new Scanner(System.in);
        year = s1.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("The given year is a Leap year");
        else
            System.out.println("The given year is not a leap year");
        System.out.println("Enter 1 to continue: ");
        System.out.println("Enter 0 to exit");
        Integer inp = s1.nextInt();
        if (inp == 1) {
            main(null);
        }
        if (inp == 0) {
            System.out.println("Exiting....");
        }
    }
}