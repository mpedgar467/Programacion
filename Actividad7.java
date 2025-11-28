package tarea5b;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TRIMESTRES = 3;
        final int ALUMNOS = 5;

        int[][] notas = new int[TRIMESTRES][ALUMNOS];

        // ---- Lectura de notas ----
        for (int t = 0; t < TRIMESTRES; t++) {
            System.out.println("Introduce las notas del trimestre " + (t + 1) + ":");
            for (int a = 0; a < ALUMNOS; a++) {
                System.out.print("  Alumno " + (a + 1) + ": ");
                notas[t][a] = sc.nextInt();
            }
        }

        // ---- Calcular y mostrar media del grupo por trimestre ----
        System.out.println("\n--- Media del grupo por trimestre ---");
        for (int t = 0; t < TRIMESTRES; t++) {
            int suma = 0;
            for (int a = 0; a < ALUMNOS; a++) {
                suma += notas[t][a];
            }
            double media = (double) suma / ALUMNOS;
            System.out.println("Media del trimestre " + (t + 1) + ": " + media);
        }

        // ---- Leer posición de alumno para calcular su media ----
        System.out.print("\nIntroduce la posición del alumno (1-5): ");
        int pos = sc.nextInt() - 1;

        if (pos < 0 || pos >= ALUMNOS) {
            System.out.println("Posición no válida.");
        } else {
            int sumaAlumno = 0;
            for (int t = 0; t < TRIMESTRES; t++) {
                sumaAlumno += notas[t][pos];
            }
            double mediaAlumno = (double) sumaAlumno / TRIMESTRES;
            System.out.println("Media del alumno " + (pos + 1) + ": " + mediaAlumno);
        }
    }
}

