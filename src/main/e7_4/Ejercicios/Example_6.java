/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e7_4.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[15];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int aux = array[array.length-1];
        for (int i = (array.length-1); i > -1; i--) {
            array[i] = array[i-1];
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        /*array[0] = aux;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");  
        }*/
    }
}
