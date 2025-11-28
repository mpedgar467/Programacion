package tarea5b;
import java.util.Scanner;
public class ej6cadenas {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Introduce la frase:");
	        String frase = sc.nextLine();

	        String inicio = "Javalín, javalón";
	        String finalDialecto = "javalén, len, len";

	        String mensaje = ""; 
	        boolean esJavalandia = false;

	        if (frase.startsWith(inicio)) {
	            esJavalandia = true;

	            mensaje = frase.substring(inicio.length());

	            mensaje = mensaje.trim();
	        }

	        else if (frase.endsWith(finalDialecto)) {
	            esJavalandia = true;

	            mensaje = frase.substring(0, frase.length() - finalDialecto.length());

	            mensaje = mensaje.trim();
	        }

	        if (esJavalandia && !mensaje.isEmpty()) {
	            System.out.println("Frase válida en Javalandia.");
	            System.out.println("Mensaje: " + mensaje);
	        } else {
	            System.out.println("La frase NO pertenece al idioma de Javalandia.");
	        }
	    }
	}


