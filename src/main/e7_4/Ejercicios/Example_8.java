/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e7_4.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite un numero: ");
            array[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Diagrama de Barras");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|--> ");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("_*");
            }
            System.out.print("\n");
        }
    }
}
