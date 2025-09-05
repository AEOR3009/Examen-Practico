/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author Axel_
 */
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un numero: ");
            int n = scanner.nextInt();
            
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            
            System.out.println("El factorial de " + n + " es " + fact);
        }
    }
}