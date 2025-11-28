package tarea5b;

public class ej4funciones {
	    public static int mayor(int a, int b) {
	        if (a > b) {
	            return a;
	        } else {
	            return b;
	        }
	    }

	    public static void main(String[] args) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        System.out.print("Introduce el primer número: ");
	        int num1 = sc.nextInt();

	        System.out.print("Introduce el segundo número: ");
	        int num2 = sc.nextInt();

	        int resultado = mayor(num1, num2);

	        System.out.println("El mayor de los dos números es: " + resultado);

	
	    }
	}


