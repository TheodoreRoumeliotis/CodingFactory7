package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        final double KM_PER_MILE = 1.6;

        Scanner in = new Scanner(System.in);
        double inputMiles = 0.0;
        double kilometres = 0.0;

        System.out.println("Please insert miles");
        inputMiles = in.nextDouble();

        kilometres = inputMiles * KM_PER_MILE;

        System.out.println("Miles: " + inputMiles + ", Km " + kilometres);
    }
}
