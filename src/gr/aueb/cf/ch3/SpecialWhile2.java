package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SpecialWhile2 {
    public static void main(String[] args) {int i = 1;
        Scanner in = new Scanner(System.in);
        int num;

        // Εισαγωγή και έλεγχος αριθμού για να βγει ο βρόχος αν είναι αρνητικός
        while (true) {
            num = in.nextInt();
            if (num < 0) {
                break; // Αν ο αριθμός είναι αρνητικός, σταματάμε τον βρόχο
            }
            // Κάνε κάτι με το num, όπως εμφάνιση ή αποθήκευση
        }

        // Ο υπόλοιπος κώδικας
        while (i <= 0) {
            System.out.println("never gets in");
            i++;
        }
        while (i < 1) {
            System.out.println("never gets in");
            i++;
        }
        while (i <= 1) {
            System.out.println("never gets in");
            i++;
        }

        // Αυτός ο βρόχος είναι άπειρος, οπότε δεν είναι καλό να το αφήσουμε να τρέχει άπειρα
        // Αλλά αν θέλεις να το αφήσεις, είναι εδώ:
        while (true) {
            System.out.println("eternal loop");
        }
    }
}


