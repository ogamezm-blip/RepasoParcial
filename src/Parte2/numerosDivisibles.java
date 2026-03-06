package Parte2;

import java.util.Scanner;

public class numerosDivisibles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        
        System.out.println("Números entre 1 y " + n + " es divisibles entre 3 pero no entre 2:");
        
        // Recorremos desde 1 hasta el numero ingresado
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}