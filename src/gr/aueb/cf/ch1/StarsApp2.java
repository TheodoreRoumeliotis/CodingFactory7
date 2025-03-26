package gr.aueb.cf.ch1;

import java.util.Scanner;

public class StarsApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfStars = 0;
        int i = 1;

        System.out.println("please insert the number of stars");
        numOfStars = scanner.nextInt();

        for(i = 1; i <= numOfStars; i++) {
            System.out.println("*");
        }
    }
}
