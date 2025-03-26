package gr.aueb.cf.ch3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LightsOn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        boolean isRunning = false;
        boolean isDark = false;
        boolean lightsOn = false;
        int carSpeed = 0;

        System.out.println("insert if is raining");
        isRaining = in.nextBoolean();



        System.out.println("insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("insert car speed");
        carSpeed = in.nextInt();

        isRunning = carSpeed > MAX_CAR_SPEED;

        lightsOn = (isRaining && isRunning) || (isRaining && isDark);

        System.out.println("the lights are on:" + lightsOn);

    }
}
