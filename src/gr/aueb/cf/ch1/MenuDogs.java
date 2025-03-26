package gr.aueb.cf.ch1;

import java.util.Scanner;

public class MenuDogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (true) {
            System.out.println(" διαλεξε μια ρατσα για φυλακα και οικογενειακο σκυλο");
            System.out.println("1. φιλα μπραζιλειρο");
            System.out.println("2. μποξερ");
            System.out.println("3. τερβιρεν");
            System.out.println("4. κανενα απο αυτα");
            
            choice = scanner.nextInt();
            
            if (choice == 4){
                System.out.println(" ε μετα παρε κανις");
                break;
            } else if (choice == 1) {
                System.out.println("πολυ κακα με τους ξενους ,θελουν προσοχη ,αλλα τελεια με παιδια");
                
            } else if (choice == 2) {
                System.out.println("αυτα και αν ειναι τελεια για οικογενεια,σαν φυλακες μετρια");

            } else if (choice == 3) {
                System.out.println("πανεξυπνα ανθρωποκεντρικα με πολυ ενεργεια και αναγκη για εκτονοση");

            } else  {
                System.out.println("λανθασμενη απαντηση");

            }

        }
        System.out.println("ευχαριστω που επελεξες την πρωτη αψογη εφαρμογη μου");
    }
}
