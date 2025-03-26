package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ScannerAddApp {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int result = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        result = num1 + num2;
        System.out.printf("Το άθροισμα των %d, %d ειναι ισο με %d", num1, num2, result);


    }
}
