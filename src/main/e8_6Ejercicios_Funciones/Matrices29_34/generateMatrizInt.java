/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Matrices29_34;

/**
 *
 * @author krodr
 */
public class generateMatrizInt {
    public static int[][] generate(int row, int column, int rangeMinimun, int rangeMaximun){
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random()*rangeMaximun)+rangeMinimun;
            }
        }
        return matrix;
        
    }
}
