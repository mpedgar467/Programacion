package tarea5b;
import java.util.Scanner;

public class ej25 {
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		double precioComida= 0;
		double precioBebida= 0;
		System.out.println("Que ha tomado el usuario de comer?: Donut , palmera o pitufo. ");
		
		String comida = sc.nextLine().toLowerCase();
		
		switch (comida) {
			case "palmera":
				precioComida =1.4;
				break;
			case "donut":
				precioComida = 1.00;
				break;
			  case "pitufo":
	                System.out.println("¿Era con aceite o con tortilla?");
	                String tipoPitufo = sc.nextLine().toLowerCase();
	                if (tipoPitufo.equals("aceite")) {
	                    precioComida = 1.20;
	                } else if (tipoPitufo.equals("tortilla")) {
	                    precioComida = 1.60;
	                } else {
	                    System.out.println("Tipo de pitufo no válido.");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Comida no válida.");
	                return;
				
		}
        System.out.println("¿Qué ha tomado de beber? (zumo o café)");
        String bebida = sc.nextLine().toLowerCase();

        if (bebida.equals("zumo")) {
            precioBebida = 1.50;
        } else if (bebida.equals("café")) {
            precioBebida = 1.20;
        } else {
            System.out.println("Bebida no válida.");
            return;
        }

        double precioTotal = precioComida + precioBebida;
        System.out.printf("El precio total del desayuno es: %.2f €%n", precioTotal);
    }
		
	}

