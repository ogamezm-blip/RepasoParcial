package Parte5;

import java.util.Scanner;

public class SumaParOImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número n: ");
        long n = scanner.nextLong();
        
        long suma = (n * (n + 1)) / 2;
        
        System.out.println("La suma de 1 a " + n + " es: " + suma);
        
        if (suma % 2 == 0) {
            System.out.println("El resultado es PAR.");
        } else {
            System.out.println("El resultado es IMPAR.");
        }
        
        scanner.close();
    }
}