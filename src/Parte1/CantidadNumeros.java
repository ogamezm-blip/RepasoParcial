package Parte1;

import java.util.Scanner;

public class CantidadNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos números desea ingresar? ");
        int n = scanner.nextInt();
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        // for para leer la cantidad de numeros
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numeroActual = scanner.nextInt(); 
            
            // if para clasificar los numeros
            if (numeroActual > 0) {
                positivos++;
            } else if (numeroActual < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        // Resultados
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
        scanner.close();
    }
}