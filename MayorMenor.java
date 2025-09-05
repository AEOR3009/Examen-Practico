/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayormenor;

/**
 *
 * @author Axel_
 */
import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Cuantos nwmeros desea ingresar? ");
            int n = scanner.nextInt();
            
            System.out.print("Ingrese el nwmero 1: ");
            float num = scanner.nextFloat();
            float mayor = num;
            float menor = num;
            
            for (int i = 2; i <= n; i++) {
                System.out.print("Ingrese el numero " + i + ": ");
                num = scanner.nextFloat();
                
                if (num > mayor) {
                    mayor = num;
                }
                
                if (num < menor) {
                    menor = num;
                }
            }
            
            System.out.printf("El número mayor es: %.2f%n", mayor);
            System.out.printf("El número menor es: %.2f%n", menor);
        }
    }
}