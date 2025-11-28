package depuraion;

public class ej3 {
	public static boolean esPrimo(int num) {
	    boolean esPrimo = true;

	    for (int i = 2; i < num && esPrimo; i++) {
	        if (num % i == 0) {
	            esPrimo = false;
	        }
	    }

	    return esPrimo;
	}

}
