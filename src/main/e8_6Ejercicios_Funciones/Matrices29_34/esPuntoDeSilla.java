/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Matrices29_34;

/**
 *
 * @author krodr
 */
public class esPuntoDeSilla {
    public static String sila(int row, int colum, int rangeMinimun, int rangeMaximun) {
        int[][] array = new int[row][colum];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random()*rangeMaximun)+rangeMinimun;
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    int div = array[i][j];
                    int counter = 0;
                    while (div != 0) {            
                        div = div/10;
                        counter++;
                    }
                    if (counter == 3) {
                        System.out.print(array[i][j] + " ");
                        continue;
                    }else if(counter == 2)  {
                        System.out.print(" " + array[i][j] + " ");
                        continue;
                    }else if(counter == 1)  {
                        System.out.print(" " + array[i][j] + "  ");
                        continue;
                    }
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        
        int maximo = 0;
        int indiceI = 0;
        int indiceJ = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if(maximo < array[i][j] ){
                    maximo = array[i][j];
                    indiceI = i;
                    indiceJ = j;
                }
            }
        }
        return "El punto de silla es " + maximo + " es el indice " + indiceI +","+indiceJ;
        
    }
}
