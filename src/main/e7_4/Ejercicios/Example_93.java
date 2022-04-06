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
public class Example_93 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*500);
        }
        int numberMax = array[0];
        for(int j : array){
            if (j > numberMax) {
                numberMax = j;
            }
        }
        int numberMin = array[array.length-1];
        for(int j : array){
            if (j < numberMin) {
                numberMin = j;
            }
        }
        System.out.println("Digite un numero para buscar el numero mayor o el menor\n Digite 1 - menor, 2 - mayor ");
        int response = input.nextInt();
        System.out.println("\n");
        int j = 25;
        for (int i = 0; i < array.length; i++) {
            
            if (response == 1) {
                if (array[i] == numberMin) {
                    System.out.print("**" +array[i]+ "**, ");
                    continue;
                }
                
                
            }else if(response == 2){
                if (array[i] == numberMax) {
                    System.out.print("**" +numberMax+ "**, ");
                    continue;
                }
                
            }
            if(i == j){
                System.out.println("\n");
                j +=25;
            }
            System.out.print(array[i] + ", ");
        }
    }
}
