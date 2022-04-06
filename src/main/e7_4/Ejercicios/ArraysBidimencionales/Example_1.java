/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e7_4.Ejercicios.ArraysBidimencionales;

/**
 *
 * @author krodr
 */
public class Example_1 {
    public static void main(String[] args) {
        int fila = 3;
        int columna = 5;
        int[][] array = new int[fila][columna]; // array de 3filas por 5 columnas;
        array[0][0] = 0;
        array[1][0] = 75;
        array[0][1] = 30;
        array[0][2] = 2;
        array[2][2] = -2;
        array[2][3] = 9;
        array[1][4] = 0;
        array[0][4] = 5;
        array[2][4] = 11;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (array[i][j] == 0 || array[i][j] == -1) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
