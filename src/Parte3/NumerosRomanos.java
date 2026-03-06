package Parte3;

import java.util.Scanner;

public class NumerosRomanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número del 1 al 5: ");
        int numero = scanner.nextInt();
        
        // Iniciamos la estructura switch
        switch (numero) {
            case 1:
                System.out.println("El número romano es: I");
                break; 
            case 2:
                System.out.println("El número romano es: II");
                break;
            case 3:
                System.out.println("El número romano es: III");
                break;
            case 4:
                System.out.println("El número romano es: IV");
                break;
            case 5:
                System.out.println("El número romano es: V");
                break;
            default:
                System.out.println("Error: El número ingresado no está en el rango del 1 al 5.");
                break;
        }
        
        scanner.close();
    }
}