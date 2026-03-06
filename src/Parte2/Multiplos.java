package Parte2;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        
        // Verificamos si es múltiplo de 7 O si es múltiplo de 11
        if (n % 7 == 0 || n % 11 == 0) {
            System.out.println(n + " es múltiplo de 7 o de 11.");
            
            // Verificar si es múltiplo de ambos
            if (n % 7 == 0 && n % 11 == 0) {
                System.out.println("De hecho, ¡es múltiplo de ambos (77)!");
            }
        } else {
            System.out.println(n + " no es múltiplo de ninguno de los dos.");
        }
        
        scanner.close();
    }
}