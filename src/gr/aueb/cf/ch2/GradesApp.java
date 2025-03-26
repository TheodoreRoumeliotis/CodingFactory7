package gr.aueb.cf.ch2;

import java.util.Scanner;

public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCourses = 0;
        int totalAmount = 0;
        int average;

        System.out.println("Δώσε το σύνολο των μαθημάτων");
        totalCourses = scanner.nextInt();

        System.out.println("Δώσε το άθροισμα όλων των βαθμών");
        totalAmount = scanner.nextInt();

        // Έλεγχος για μη έγκυρο αριθμό μαθημάτων
        if (totalCourses <= 0) {
            System.out.println("Λάθος: Ο αριθμός των μαθημάτων πρέπει να είναι θετικός.");
            System.exit(1);
        }

        // Υπολογισμός μέσου όρου
        average = totalAmount / totalCourses;

        // Έλεγχος και κατηγοριοποίηση
        if (average >= 9 && average <= 10) {
            System.out.println("Άριστος");
        } else if (average <= 5) {
            System.out.println("Αδιάβαστος");
        } else if (average > 5 && average < 9) {
            System.out.println("Μέτριος");
        } else {
            System.out.println("Μη έγκυρος μέσος όρος");
        }
    }
}


