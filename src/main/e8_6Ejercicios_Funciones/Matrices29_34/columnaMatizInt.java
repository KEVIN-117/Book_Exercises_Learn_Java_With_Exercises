/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Matrices29_34;

/**
 *
 * @author krodr
 */
public class columnaMatizInt {
    public static int[][] columna(int jEsimaColumna, int row, int colum, int rangeMinimun, int rangeMaximun){
        int[][] matrix = new int[row][colum];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random()*rangeMaximun)+rangeMinimun;
            }
        }
        System.out.println("Matriz completa");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("j-esima Columna");
        System.out.println();
        return matrix;
        
    }
}
