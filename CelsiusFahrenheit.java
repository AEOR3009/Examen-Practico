/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celsiusfahrenheit;

/**
 *
 * @author Axel_
 */
import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese grados Celsius: ");
            float celsius = scanner.nextFloat();
            
            float fahrenheit = (celsius * 9.0f/5.0f) + 32.0f;
            
            System.out.printf("%.2f grados C = %.2f grados F%n", celsius, fahrenheit);
        }
    }
}