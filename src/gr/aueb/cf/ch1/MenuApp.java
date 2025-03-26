package gr.aueb.cf.ch1;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            // Εμφάνιση επιλογών
            System.out.println("Επέλεξε μια από τις παρακάτω φυλές:");
            System.out.println("1. Ροτβάιλερ");
            System.out.println("2. Μπόξερ");
            System.out.println("3. Μπάντογκ");
            System.out.println("4. Fila Brasileiro");
            System.out.println("5. Καμία από τις παραπάνω");
            System.out.print("Δώσε την επιλογή σου (1-5): ");

            // Ανάγνωση επιλογής
            choice = scanner.nextInt();

            // Επεξεργασία επιλογών
            if (choice == 5) {
                System.out.println("Ε και ποια σου αρέσει; Τα τσοου τσοου;");
                break;
            } else if (choice == 1) {
                System.out.println("Ροτβάιλερ: Υπέροχα σκυλιά, ιδιαίτερα αλλά απαιτητικά.");
            } else if (choice == 2) {
                System.out.println("Μπόξερ: Καλοί φύλακες και εξαιρετικοί με τα παιδιά.");
            } else if (choice == 3) {
                System.out.println("Μπάντογκ: Αν είναι καλή η μίξη, είναι τρομερά και πολύ ανθρωποκεντρικά.");
            } else if (choice == 4) {
                System.out.println("Fila Brasileiro: Σπάνια σκυλιά, αποθαρρύνουν τους ξένους αλλά λατρεύουν την οικογένεια.");
            } else {
                System.out.println("Λάθος επιλογή. Προσπάθησε ξανά.");
            }
        }

        System.out.println("Ευχαριστούμε που χρησιμοποίησες την εφαρμογή μας!");
    }
}