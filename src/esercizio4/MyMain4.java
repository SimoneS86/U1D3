package esercizio4;

import java.util.Scanner;

public class MyMain4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero intero: ");
		int num = input.nextInt();
		
		System.out.println("Countdown:");
		for(int i = num; i>=0; i--) {
			System.out.println(i);
		}
		input.close();
	}

}
