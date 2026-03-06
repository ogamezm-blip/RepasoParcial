package Parte5;

import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Aplicamos la fórmula de conversión
        double fahrenheit = (celsius * 1.8) + 32;
        
        // Resultado
        System.out.printf("%.2f °C equivalen a %.2f °F%n", celsius, fahrenheit);
        
        scanner.close();
    }
}