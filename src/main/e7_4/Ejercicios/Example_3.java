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
public class Example_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int [10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un numero: ");
            array[i] = input.nextInt();
        }
        for (int j = 9; j >= 0; j--) {
                System.out.println(array[j] + " ");
        }
    }
}
