package gr.aueb.cf.ch1;

import java.util.Scanner;

public class StarsApp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStars = 0;


        System.out.println("please enter the number of stars");
        numStars = scanner.nextInt();

        // Descending
        System.out.println("Descending Stars");
        for (int i = numStars; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
