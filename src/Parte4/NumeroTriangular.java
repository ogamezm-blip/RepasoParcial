package Parte4;

import java.util.Scanner;

public class NumeroTriangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para verificar si es triangular: ");
        int n = scanner.nextInt();

        int suma = 0;
        int k = 1;
        boolean esTriangular = false;

        while (suma < n) {
            suma += k;
            if (suma == n) {
                esTriangular = true;
                break;
            }
            k++;
        }

        if (n > 0 && esTriangular) {
            System.out.println(n + " es un número triangular (corresponde a la suma hasta " + k + ").");
        } else {
            System.out.println(n + " no es un número triangular.");
        }

        scanner.close();
    }
}