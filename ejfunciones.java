package tarea5b;

public class ejfunciones {

	    public static void mostrarNumerosEntre(int a, int b) {
	        if (a == b) {
	            System.out.println("Los números son iguales, no hay números entre ellos.");
	        } else {
	            System.out.println("Números comprendidos entre " + a + " y " + b + ":");
	            if (a < b) {
	                for (int i = a + 1; i < b; i++) {
	                    System.out.print(i + " ");
	                }
	            } else { // si a > b
	                for (int i = a - 1; i > b; i--) {
	                    System.out.print(i + " ");
	                }
	            }
	            System.out.println(); 
	        }
	    }

	    public static void main(String[] args) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        System.out.print("Introduce el primer número: ");
	        int num1 = sc.nextInt();

	        System.out.print("Introduce el segundo número: ");
	        int num2 = sc.nextInt();

	        mostrarNumerosEntre(num1, num2);
	    }
	}

