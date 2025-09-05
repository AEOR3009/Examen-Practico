/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

/**
 *
 * @author Axel_
 */
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un numero o palabra: ");
            String texto = scanner.nextLine();
            
            String textoInvertido = new StringBuilder(texto).reverse().toString();
            
            if (texto.equals(textoInvertido)) {
                System.out.println("Es un palindromo");
            } else {
                System.out.println("No es un palindromo");
            }
        }
    }
}