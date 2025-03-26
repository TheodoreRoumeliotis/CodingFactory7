package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("please select the following");
            System.out.println("1. insert");
            System.out.println("2. delete");
            System.out.println("3.quit");
            choice = in.nextInt();
        } while (choice != 3);
        System.out.println("thanks");
    }
}
