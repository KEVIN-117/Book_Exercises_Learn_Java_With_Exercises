/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Matrices29_34;

/**
 *
 * @author krodr
 */
public class DiagonalMatriz {
    public static int[][] diagonal(int row, int colum, int rangeMinimun, int rangeMaximun, int rowSearch ){
        int[][] matriz = new int[row][colum];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*rangeMaximun)+rangeMinimun;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        return matriz;
        
    }
}
