package Parte4;

import java.util.Scanner;

public class PromedioNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números desea ingresar? ");
        int n = scanner.nextInt();

        double sumaNegativos = 0;
        int contadorNegativos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();

            // Solo se acumula si el número es negativo
            if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            }
        }

        // Validamos si se ingresó al menos un número negativo
        if (contadorNegativos > 0) {
            double promedio = sumaNegativos / contadorNegativos;
            System.out.println("El promedio de los números negativos es: " + promedio);
        } else {
            System.out.println("No hay negativos");
        }

        scanner.close();
    }
}