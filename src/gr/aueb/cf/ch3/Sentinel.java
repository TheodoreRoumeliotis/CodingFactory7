package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        int positiveCounts = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;


        System.out.println("insert a num babe");
        inputNum = in.nextInt();

        while (inputNum >= 0) {
            positiveCounts++;
            System.out.println("insert a num babe");
            inputNum = in.nextInt();
        }
        System.out.println(positiveCounts);

    }
}
