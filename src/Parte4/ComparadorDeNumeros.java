package Parte4;

import java.util.Scanner;

public class ComparadorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número (a): ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el segundo número (b): ");
        double b = scanner.nextDouble();

        // Usar la clase Math para encontrar el mayor, el menor y la diferencia
        double mayor = Math.max(a, b);
        double menor = Math.min(a, b);
        double diferencia = Math.abs(a - b);

        // Mostrar los resultados
        System.out.println("\nResultados");
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La diferencia absoluta es: " + diferencia);

        scanner.close();
    }
}