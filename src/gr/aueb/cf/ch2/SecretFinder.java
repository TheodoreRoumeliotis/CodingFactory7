package gr.aueb.cf.ch2;

import java.util.Scanner;

public class SecretFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET_NUM = 3;

        System.out.println("Παρακαλώ προσπάθησε να βρείς τον μυστικό αριθμό νε την πρώτη,δώσε ενα τυχαίο νούμερο");
        num = scanner.nextInt();

        if (num == SECRET_NUM){
            System.out.println("Το βρήκες,μπράβο σου");
        }
        else {
            System.out.println("Δεν το βρήκες,προσπάθησε πάλι ");
        }
    }

}
