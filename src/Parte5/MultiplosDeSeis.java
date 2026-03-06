package Parte5;

import java.util.Scanner;

public class MultiplosDeSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos múltiplos de 6 desea ver? ");
        int n = scanner.nextInt();
        
        System.out.println("Los primeros " + n + " múltiplos de 6 son:");
        
        for (int i = 1; i <= n; i++) {
            int multiplo = 6 * i;
            System.out.print(multiplo + " ");
        }
   
        scanner.close();
    }
}