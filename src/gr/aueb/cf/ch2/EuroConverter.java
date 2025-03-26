package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroConverter {
    public static void main(String[] args) {

        int inputEuros = 0;
        int totalAmount = 0;
        int americanDollars = 0;
        int americanCents = 0;
        final int Parity = 99;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισήγαγε ενα ποσό σε ευρώ");
        inputEuros = scanner.nextInt();

        totalAmount = inputEuros * Parity;
        americanDollars = totalAmount / 100;
        americanCents = totalAmount % 100;

        System.out.printf("%d %d", americanDollars, americanCents);




    }
}
