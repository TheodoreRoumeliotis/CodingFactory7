package gr.aueb.cf.ch3;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age = 0;
        final int RIGHT_AGE = 18;
        boolean isEligible = false;

        System.out.printf("please insert your age");
        age = in.nextInt();

        isEligible = age >= RIGHT_AGE;

        System.out.println("You have the right to vote " + isEligible);


    }
}
