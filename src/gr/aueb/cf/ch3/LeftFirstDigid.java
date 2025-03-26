package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeftFirstDigid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;

        System.out.println("please insert a number");
        inputNum = in.nextInt();
        tempNum = inputNum;

        while (tempNum >= 10){

            tempNum /= 10;
        }
        System.out.println("the first digit of: " + inputNum + "is " + tempNum);



    }
}


