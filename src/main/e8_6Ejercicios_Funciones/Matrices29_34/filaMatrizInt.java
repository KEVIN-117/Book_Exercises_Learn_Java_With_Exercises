/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Matrices29_34;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class filaMatrizInt {
    public static int[][] FilaIesima(int fila_I_esima, int row, int colum, int rangeMinimun, int rabgeMaximun) {
        int[][] array = new int[row][colum];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random()*rabgeMaximun)+rangeMinimun;
            }
        }
        System.out.println("Matriz original");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return array;
    }
}
