package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("pleae insert base and power");
        base = in.nextInt();
        power = in.nextInt();

        while (i <= power){

            result = result * base;
            i++;
        }
        System.out.println("result " + result);


    }
}
