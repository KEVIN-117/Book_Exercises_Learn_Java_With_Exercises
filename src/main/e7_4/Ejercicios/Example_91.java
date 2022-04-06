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
public class Example_91 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int[] array = new int[10];
        int[] array = {5, 6, 7, 13, 15, 17, 43, 45, 47, 83};
        /*for (int i =0 ; i < array.length ; i++) {
            System.err.println("Digite un numero: ");
            array[i] = input.nextInt();
        }*/
        int aux[] = new int[10];
        int contador = 0;
        boolean esPrimo = false;
        for (int i = 0; i < array.length; i++) {
            esPrimo = true;
            for (int j = 2; j < array[i]-1; j++) {
                if (array[i]%j == 0) {
                    esPrimo = false;
                }
                if (!esPrimo) {
                    aux[contador] = array[i];
                    array[i] = -1;
                    contador++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] != -1){
                int trash = array[i];
                for (int j = 0; j < i ; j++){
                  if (array[i-j-1] == -1){
                    array[i-j-1] = trash;
                    array[i-j] = -1;
                  }
                }
            }
        }
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                array[i] = aux[j];
                j++;
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");    
        }
    }
}
