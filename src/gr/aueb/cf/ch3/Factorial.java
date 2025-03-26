package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputnum = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert num:");
        inputnum = in.nextInt();

        while (i <= inputnum) {
            facto = facto * i;  // Υπολογίζει το παραγοντικό
            i++;
        }

        System.out.println("Factorial: " + facto);
    }
}
