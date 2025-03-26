package gr.aueb.cf.ch1;

import java.util.Scanner;

public class LeapYearApp {
    public static void main(String[] args) {
        int year = 0;
        boolean isLeap = false;
        Scanner scanner = new Scanner(System.in);



        System.out.println("Please insert a year");
        year = scanner.nextInt();

        isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        System.out.println("Year: " + year + " is leap: " + isLeap);
    }
}
