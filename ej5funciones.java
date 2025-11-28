package tarea5b;

public class ej5funciones {

	    public static int mayor(int a, int b) {
	        return (a > b) ? a : b;
	    }
	    
	    public static int mayorDeTres(int a, int b, int c) {
	        return mayor(mayor(a, b), c);
	    }

	    public static void main(String[] args) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        System.out.print("Introduce el primer número: ");
	        int num1 = sc.nextInt();

	        System.out.print("Introduce el segundo número: ");
	        int num2 = sc.nextInt();

	        System.out.print("Introduce el tercer número: ");
	        int num3 = sc.nextInt();

	        int resultado = mayorDeTres(num1, num2, num3);

	        System.out.println("El mayor de los tres números es: " + resultado);

	    }
	}

