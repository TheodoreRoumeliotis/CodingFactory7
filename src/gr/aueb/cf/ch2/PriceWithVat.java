package gr.aueb.cf.ch2;

import java.util.Scanner;

public class PriceWithVat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double VAT_RATE = 0.24;
        double inputPrice = 0.0;
        double totalPrice = 0.0;
        double vat = 0.0;

        System.out.println("Please insert a price:");
        inputPrice = sc.nextDouble();

        vat = inputPrice * VAT_RATE;
        totalPrice = vat + inputPrice;

        System.out.println("THE SUM IS: " + totalPrice);

        // Κλείσιμο του Scanner
        sc.close();
    }
}

