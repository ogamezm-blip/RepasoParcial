package Parte4;

import java.util.Scanner;

public class ContadorDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        // Inicializamos el número y usamos Math.abs para manejar negativos
        long n = Math.abs(scanner.nextLong());

        int contador = 0;
        long numero = n;

        // Si el número es 0, se considera un dígito par
        if (n == 0) {
            contador = 1;
        } else {
            while (n > 0) {
                long digito = n % 10;

                if (digito % 2 == 0) {
                    contador++;
                }
                n = n / 10;
            }
        }

        System.out.println("El número " + numero + " contiene " + contador + " dígitos pares.");

        scanner.close();
    }
}