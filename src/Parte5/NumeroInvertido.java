package Parte5;

import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número para invertirlo: ");
        long n = scanner.nextLong();
        
        long numeroOriginal = n;
        long invertido = 0;
        
        // Trabajamos con el valor absoluto
        long temp = Math.abs(n);
        
        while (temp > 0) {
            // Obtenemos el último dígito
            long digito = temp % 10;
            
            // Construimos el invertido: multiplicamos el actual por 10 y sumamos el dígito
            invertido = (invertido * 10) + digito;
            
            // Eliminamos el último dígito del número temporal
            temp = temp / 10;
        }
        
        // Si el número original era negativo, devolvemos su signo
        if (n < 0) {
            invertido = -invertido;
        }
        
        System.out.println("El número invertido es: " + invertido);
        
        scanner.close();
    }
}