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
public class Example_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite un numero: ");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0){
                System.out.println( array[i] + " es par ");
            }else{
                System.out.println( array[i] + " es impar ");
            }
        }
    }
}
