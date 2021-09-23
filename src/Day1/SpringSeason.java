package Day1;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        int m, d;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the month");
        m = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the day");
        d = s2.nextInt();

        if (m >= 3 || m <= 6) {
            if (m == 3) {
                if (d >= 20) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (m == 6) {
                if (d <= 20) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("False");
        }
        System.out.println("Enter 1 to continue: ");
        Integer inp = s1.nextInt();
        if (inp == 1) {
            main(null);
        }
    }
}
