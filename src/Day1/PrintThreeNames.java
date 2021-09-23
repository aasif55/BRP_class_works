package Day1;

import java.util.Scanner;

public class PrintThreeNames {
    public static void main(String[] args) {

        //String[] arr = {"Alice","Bob","Carol"};
        Scanner sc=new Scanner(System.in); //taking user's input
        String[] arr = new String[3]; //initialize the array
        System.out.println("Enter three names: ");
        for(int i=0;i<3;i++)
        {
            arr[i] = sc.next();
        }

        System.out.print("Hi ");
        for (int i = arr.length-1; i>=0; i--)
        {
            if (i == arr.length-1) {
                System.out.print(arr[i]);
            }
            else
            {
                System.out.print(", " + arr[i]);
            }
        }
    }
}
