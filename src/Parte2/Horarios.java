package Parte2;

import java.util.Scanner;

public class Horarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una hora en formato 24 horas (0-23): ");
        int hora = scanner.nextInt();
        
        // Validamos que la hora tenga sentido (entre 0 y 23)
        if (hora >= 0 && hora <= 23) {
            
            // Clasificamos la hora en los tres rangos solicitados
            if (hora >= 0 && hora <= 11) {
                System.out.println("Mañana");
            } else if (hora >= 12 && hora <= 18) {
                System.out.println("Tarde");
            } else {
                System.out.println("Noche");
            }
            
        } else {
            System.out.println("Error: La hora ingresada no es válida. Debe estar entre 0 y 23.");
        }
        
        scanner.close();
    }
}