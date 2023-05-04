package esercizio1;

public class MyMain {

	public static void main(String[] args) {
		String stringa1 = "ciao";
		String stringa2 = "tre";
		int anno1 = 2000;
		int anno2 = 2023;

		System.out.println(stringa1 + " ha un numero pari di caratteri? " + stringaPariDispari(stringa1));
		System.out.println(stringa2 + " ha un numero pari di caratteri? " + stringaPariDispari(stringa2));
		System.out.println(anno1 + " e' bisestile? " + annoBisestile(anno1));
		System.out.println(anno2 + " e' bisestile? " + annoBisestile(anno2));
	}
	
	public static boolean stringaPariDispari(String str) {
	    int lunghezza = str.length();
	    return lunghezza % 2 == 0;
	}

	public static boolean annoBisestile(int anno) {
	    return anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0 ? true : false;
	 
	}
}
