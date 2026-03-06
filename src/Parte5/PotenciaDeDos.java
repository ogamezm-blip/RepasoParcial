package Parte5;

import java.util.Scanner;

public class PotenciaDeDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número para verificar si es potencia de 2: ");
        long n = scanner.nextLong();
        
        // Un número menor o igual a 0 no puede ser potencia de 2
        if (n <= 0) {
            System.out.println(n + " no es potencia de 2.");
        } else {
            long temp = n;
            while (temp % 2 == 0) {
                temp /= 2;
            }

            if (temp == 1) {
                System.out.println(n + " es potencia de 2.");
            } else {
                System.out.println(n + " no es potencia de 2.");
            }
        }
        
        scanner.close();
    }
}