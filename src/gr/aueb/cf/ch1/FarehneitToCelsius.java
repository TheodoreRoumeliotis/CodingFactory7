package gr.aueb.cf.ch1;

import java.util.Scanner;

public class FarehneitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahreneit = 0;
        int celsium = 0;

        System.out.println("Please insert degrees Fahreneit");
        fahreneit = scanner.nextInt();


        celsium = 5 * (fahreneit);

        System.out.printf("%d ,%d ", fahreneit, celsium);


    }
}
