package gr.aueb.cf.ch3;

import java.util.Scanner;

public class AnotherAddApp {
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int i = 2;


        System.out.println("please insert a number");
        num = in.nextInt();

        while (i <= num){
            sum += i;
            i += 2;

        }
        System.out.println("the sum of even numbers up to: " + num + "is" + sum);
    }
}
