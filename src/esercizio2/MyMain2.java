package esercizio2;

import java.util.Scanner;

public class MyMain2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = input.nextInt();

        String numeroInLettere = NumeroScritto.scriviNumero(numero);

        System.out.println(numeroInLettere);
        input.close();
	}

}
