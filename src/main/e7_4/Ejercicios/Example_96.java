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
public class Example_96 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*400);
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("] ");
        System.out.println();
        System.out.println("Digite un numero\n1 - para resaltar los numeros multiplos de 5 o 2 - para resaltar los numeros multiplos de 7");
        int response = input.nextInt();
        /*int number = 125;
        int residuo = number%10;
        System.out.println(residuo);*/
        for (int i = 0; i < array.length; i++) {
            if(response == 1){
                if (array[i] % 10 == 5 || array[i] % 10 == 0) {
                    System.out.print("[" + array[i] + "], ");
                    continue;
                }
            }else if(response == 2){
                for (int j = 0; j < 10; j++) {
                    if(array[i] / 10 == j*7){
                        System.out.print("[" + array[i] + "], ");
                        continue;
                    }
                }
                
            }
            System.out.print(array[i] + ", ");
        }
    }
}
