/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e7_4.Ejercicios.ArraysBidimencionales;

import java.util.Arrays;

/**
 *
 * @author krodr
 */
public class Example_6 {
    public static void main(String[] args) {
        int fila = 6;
        int columna = 10;
        int array[][] = new int [fila][columna];
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                array[i][j] = (int) (Math.random()*1000);
            }
        }
        System.out.println("Array Original");
        System.out.println();
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(array[i][j] + " ");  
            }
            System.out.println();            
        }
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                for (int k = 1; k < fila; k++) {
                    for (int l = 1; l < columna; l++) {
                        if(array[i][j] == array[k][l]){
                            array[i][j] = -1;
                        }
                    }
                }
            }
        }
        
        System.out.println("Array sin balores repetidos");
        System.out.println();
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(array[i][j] + " ");  
            }
            System.out.println();            
        }
    }
}
