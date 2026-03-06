package Parte1;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        
        int sumaPares = 0;
        int contadorPares = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumaPares += i;    
                contadorPares++;   
            }
        }
        
        // Validamos que existan numeros pares para evitar división por cero
        if (contadorPares > 0) {
            double promedio = (double) sumaPares / contadorPares;
            System.out.println("El promedio de los números pares es: " + promedio);
        } else {
            System.out.println("No se encontraron números pares en el rango.");
        }
        
        scanner.close();
    }
}