package Parte4;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número n para generar su tabla de división: ");
        double n = scanner.nextDouble();

        System.out.println("\nTabla de división de " + n );

        // Ciclo del 1 al 10 
        for (int i = 1; i <= 10; i++) {
            if (i != 0) {
                double resultado = n / i;
                
                // Usamos prints para limitar a 2 decimales y que se vea ordenado (ayusa externa)
                System.out.printf("%.2f / %d = %.2f%n", n, i, resultado);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
        }

        scanner.close();
    }
}