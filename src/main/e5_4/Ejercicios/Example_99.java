/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e5_4.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_99 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Digite la altura de la piramide: ");
        int altura = input.nextInt();
        System.out.println("Digite el caracter con el que quiere pintar la priramide: ");
        String caracter = input.next();
        
        for (int i = 0; i <= altura; i++) {
            
        }*/
        System.out.println("Introduce la altura: ");
        int h = input.nextInt();
        System.out.println("Introduce el caracter: ");
        String car = input.next();
        for (int fil = 0; fil < h; ++fil) {
            for (int col = 0; col < h-fil-1; ++col) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2*fil+1; ++col) {
                System.out.print(car);
            }
            System.out.println();
        }
        
    }
}
