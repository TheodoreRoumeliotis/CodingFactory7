package gr.aueb.cf.ch3;

import java.util.Scanner;

public class RottApp2 {
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

        if (isRott) {
            System.out.println("το σκυλο ειναι ροτ");
        } else {
            System.out.println("το σκυλι δεν ειναι ροτ");

        }
    }
}
