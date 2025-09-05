/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author Axel_
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Cuantos terminos de Fibonacci desea? ");
            int n = scanner.nextInt();
            int a = 0, b = 1, temp;
            System.out.println("Serie de Fibonacci:");
            for (int i = 0; i < n; i++) {
                System.out.println(a);
                temp = a + b;
                a = b;
                b = temp;
            }
        }
    }
}