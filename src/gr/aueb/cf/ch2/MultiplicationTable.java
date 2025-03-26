package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("Δώσε μου ενα αριθμό");
        num = scanner.nextInt();

        while (i <= 10) {
            System.out.println(num + "* " + i + "= " + (num * i));

            System.out.printf("%d * %d = %d\n", num, i, num * i);
            i++;
        }
    }
}
