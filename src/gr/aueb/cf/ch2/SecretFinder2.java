package gr.aueb.cf.ch2;

import java.util.Scanner;

public class SecretFinder2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET_NUM = 3;



        while (true) {
            System.out.println("Δώσε ενα τυχαίο αριθμό");
            num = scanner.nextInt();

            if (num != SECRET_NUM) {
                System.out.println("δοκίμασε ξανά");
                continue;

            }
            System.out.println("μπράβο");
            break;
        }


    }
}
