package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SpecialWhile {
    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        int num;

        while ((num = in.nextInt()) >= 0);

        while (i <= 0){
            System.out.println("never gets in");
            i++;
        }
        while (i < 1){
            System.out.println("never gets in");
            i++;
        }
        while (i <= 1){
            System.out.println("never gets in");
            i++;
        }
        while (true){
            System.out.println("eternal loop");

        }

    }
}
