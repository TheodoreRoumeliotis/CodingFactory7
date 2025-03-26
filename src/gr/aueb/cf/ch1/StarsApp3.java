package gr.aueb.cf.ch1;

import java.util.Scanner;

public class StarsApp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStars = 0;
        int i = 0;
        int j = 0;

        System.out.println("please inser teh number of stars");
        numStars = scanner.nextInt();

        for (i = 1; i <= numStars; i++) {
            for (j = 1; j <= numStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
