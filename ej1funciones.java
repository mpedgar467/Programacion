package tarea5b;

public class ej1funciones {

	    public static void eco(int n) {
	        for (int i = 0; i < n; i++) {
	            System.out.println("Eco...");
	        }
	    }

	    public static void main(String[] args) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        System.out.print("¿Cuántas veces quieres escuchar el eco? ");
	        int veces = sc.nextInt();
	        
	        eco(veces);

	        sc.close();
	    }
	}


