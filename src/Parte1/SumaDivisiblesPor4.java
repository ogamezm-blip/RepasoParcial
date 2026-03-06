package Parte1;

import java.util.Scanner;

public class SumaDivisiblesPor4 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        int suma = 0;
        
        // Recorre los números desde 1 hasta el ingresado
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                suma += i; 
            }
        }
        
        // Resultado final
        System.out.println("La suma de todos los números divisibles entre 4 desde 1 hasta " + n + " es: " + suma);
        
        scanner.close();
    }
}