package gr.aueb.cf.ch3;

import java.util.Scanner;

public class RottweilerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isBrown = false;
        boolean isBlack = false;
        boolean isAgressive = false;
        boolean isRott = false;

        System.out.println("is brown");
        isBrown = scanner.nextBoolean();

        System.out.println("is black?");
        isBlack = scanner.nextBoolean();

        System.out.println("is agressive");
        isAgressive = scanner.nextBoolean();

        isRott = (isAgressive && isBlack && isBrown);

        System.out.println("The breed of the dog is Rot " + isRott);
    }
}
