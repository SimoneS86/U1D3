package esercizio3;

public class StringheSuddivise {
	public static void suddividiStringa(String input) {
        String[] caratteri = input.split("");

        for (int i = 0; i < caratteri.length; i++) {
            System.out.print(caratteri[i]);

            if (i < caratteri.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();
    }

}
