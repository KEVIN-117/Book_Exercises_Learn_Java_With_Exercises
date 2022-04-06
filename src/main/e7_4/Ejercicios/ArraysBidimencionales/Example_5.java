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
public class Example_5 {
    public static void main(String[] args) {
        int fila = 6;
        int columna = 10; 
        int[][] number = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                number[i][j] = (int) (Math.random()*1000);
            }
        }
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
        
        /*
        Buscando en numero menor del array number
        */
        int numMin = number[number.length-1][number.length-1];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if(number[i][j] < numMin){
                    numMin = number[i][j];
                }
            }
        }
        System.out.println("Numero minimo " + numMin);
        
        
        /*
        Busca el numero mayor del array number
        */
        int numMax = number[0][0];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if(number[i][j] > numMax){
                    numMax = number[i][j];
                }
            }
        }
        System.out.println("numero maximo " + numMax);
        
        /*
        Hara una compararcion hasta encontar el numero menor
        Cuando lo encuentre imprimira el lugar donde se encuentra
        */
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (number[i][j] == numMin) {
                    System.out.println("Indice Numero Menor: " + i + ", " + j);
                    
                }
            }
        }
        
        /*
        Hara una compararcion hasta encontar el numero mayor
        Cuando lo encuentre imprimira el lugar donde se encuentra
        */
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if(number[i][j] == numMax){
                    System.out.println("Indice Numero Mayor: " + i + ", " + j);
                }
            }
        }
        
        
    }
}
