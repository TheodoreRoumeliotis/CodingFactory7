package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DaysToSeconds {
    public static void main(String[] args) {
        final int SEC_PER_DAY = 3600 * 24;
        final int SEC_PER_HOUR = 3600;
        final  int SEC_PER_MINUTE = 60;

        Scanner scanner = new Scanner(System.in);

        int inputDays = 0;
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;

        System.out.println("Παρακαλώ εισάγετε ημέρες,ώρες,λεπτά,δευτερόλεπτα");
        inputDays = scanner.nextInt();
        inputHours = scanner.nextInt();
        inputHours = scanner.nextInt();
        inputSeconds = scanner.nextInt();

        totalSeconds = inputDays * SEC_PER_DAY + inputHours * SEC_PER_HOUR +
                inputMinutes * SEC_PER_MINUTE + inputSeconds;

        System.out.println("Το άθροισμα των δευτερολέπτων ειναι " + totalSeconds);

    }
}
