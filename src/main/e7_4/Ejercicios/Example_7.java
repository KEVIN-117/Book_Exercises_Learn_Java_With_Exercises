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
public class Example_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[100];
        for (int i = 0; i < 100; i++) {
            number[i] = (int) (Math.random()*20);
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.println("Ingrese un numero");
        int number2 = input.nextInt();
        System.out.println("Ingrese el nuemro a reemplsar (0-20):");
        int numberReplase = input.nextInt();
        for (int i = 0; i < number.length; i++) {
            if(number[i] == numberReplase){
                System.out.print(" \""+ number2+"\" ");
            }
            else{
                System.out.print(number[i] + " ");
            }
        }
        
    }
}
