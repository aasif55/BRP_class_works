package Day1;

import java.util.Scanner;

public class PrintThreeNames {
    public static void main(String[] args) {

        //String[] arr = {"asif","anup","akash"};
        String[] arr = new String[3];
        Scanner sc=new Scanner(System.in);
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
