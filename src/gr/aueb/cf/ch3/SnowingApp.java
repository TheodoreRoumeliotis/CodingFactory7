package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        boolean isRaining;
        boolean isSnowing;
        Scanner in = new Scanner(System.in);
        int temp = 0;


        System.out.println("please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("please insert the temperature");
        temp = in.nextInt();

        isSnowing = isRaining && (temp<=0);

        System.out.println("is snowing: " + isSnowing);
    }
}
