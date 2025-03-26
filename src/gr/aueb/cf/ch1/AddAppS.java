package gr.aueb.cf.ch1;

import java.util.Scanner;

public class AddAppS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;



        System.out.println("plese give one number");
        num1 = scanner.nextInt();

        System.out.println("please give me another number");
        num2 = scanner.nextInt();

        result = num1 + num2;

        System.out.println("Το άθροισμα του " + num1 +  " + " + num2 + " ειναι " + result);


    }
}
