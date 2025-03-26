package gr.aueb.cf.ch2;

import java.util.Scanner;

public class SecretFind3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 3;
        boolean success = false;

        do {
            System.out.println("δωσε ενα αριθμο");
            num = scanner.nextInt();
            if (num == SECRET) {
                System.out.println("bravo");
                success = true;
            }
            else {
                System.out.println("try again");
            }
        }
        while (!success);
    }
}
