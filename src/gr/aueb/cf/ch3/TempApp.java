package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TempApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero;

        System.out.println("insert current temperature");
        temp = in.nextInt();

        isTempBelowZero = temp<0;

        System.out.println("the temperature is below zero: " + isTempBelowZero);



    }
}
