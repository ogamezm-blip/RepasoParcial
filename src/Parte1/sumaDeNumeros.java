package Parte1;

import java.util.Scanner;

public class sumaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        long n = Math.abs(scanner.nextLong());
        
        long suma = 0;
        long numeroOriginal = n; 
        
        // Mientras el número sea mayor a 0, se sigue extrayendo dígitos
        while (n > 0) {
            suma += (n % 10);
            // Eliminamos el último dígito usando la división entera entre 10
            n = n / 10;
        }
        // Muestra la suma de los dígitos
        System.out.println("La suma de los dígitos de " + numeroOriginal + " es: " + suma);
        
        scanner.close();
    }
}