/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Matrices29_34;

/**
 *
 * @author krodr
 */
public class esCoordenadasEnMatriz {
    public static String coodenadas(int SearchNumber, int row, int colum, int rageMinimun, int rangeMaximun){
        int[][] matrix = new int[row][colum];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random()*rangeMaximun)+rageMinimun;
            } 
        }
        
        System.out.println("MATRIX");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            } 
            System.out.println();
        }
        
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == SearchNumber) {
                    return "El numero " + SearchNumber + " se encuentra en la matrz sus coordenadas son " + i+","+j;
                }
            } 
        }
        return "{-1,-1}";
        
    }
}
