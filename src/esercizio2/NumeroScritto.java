package esercizio2;

public class NumeroScritto {
	public static String scriviNumero(int numero) {
        switch (numero) {
            case 0:
                return "zero";
            case 1:
                return "uno";
            case 2:
                return "due";
            case 3:
                return "tre";
            default:
                return "Il valore inserito non è compreso tra 0 e 3.";
        }
    }
}
