package tarea5b;

public class ej3funciones {
	
	    public static void calcularCilindro(int opcion, double radio, double altura) {
	        double resultado;

	        if (opcion == 1) {
	            resultado = 2 * Math.PI * radio * (altura + radio);
	            System.out.println("El área total del cilindro es: " + resultado);
	        } else if (opcion == 2) {
	          
	            resultado = Math.PI * Math.pow(radio, 2) * altura;
	            System.out.println("El volumen del cilindro es: " + resultado);
	        } else {
	            System.out.println("Opción no válida. Usa 1 para área o 2 para volumen.");
	        }
	    }

	    public static void main(String[] args) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        System.out.print("Introduce el radio del cilindro: ");
	        double r = sc.nextDouble();

	        System.out.print("Introduce la altura del cilindro: ");
	        double h = sc.nextDouble();

	        System.out.print("¿Qué deseas calcular? (1 = área, 2 = volumen): ");
	        int opcion = sc.nextInt();

	        calcularCilindro(opcion, r, h);

	        sc.close();
	    }
	}


