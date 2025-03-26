package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("please enter an random number,positive or negative");
        num = scanner.nextInt();

        abs = (num >= 0 ) ? num : -num;

        System.out.println("Το απόλυτο του " + num + " ειναι " + abs);
    }
}
