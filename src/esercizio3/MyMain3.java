package esercizio3;

import java.util.Scanner;

public class MyMain3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals(":q")) {
            System.out.print("Inserisci una stringa (o :q per uscire): ");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                StringheSuddivise.suddividiStringa(input);
            }
        }

        scanner.close();

	}

}
