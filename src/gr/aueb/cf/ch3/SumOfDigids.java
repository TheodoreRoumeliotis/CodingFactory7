package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumOfDigids {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int intPutnum = 0;
        int sum = 0;
        int tempNum = 0;
        int rightDigid = 0;


        System.out.println("please inser a digid");
        intPutnum = in.nextInt();

        tempNum = intPutnum;
        while (tempNum > 0){
            rightDigid = tempNum % 10;
            sum += rightDigid;
            tempNum /= 10;
        }
        System.out.println("the sum is: " + sum);



    }
}
