/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e7_4.Ejercicios.ArraysBidimencionales;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author krodr
 */
public class Example_3 {
    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(10);// Ejcuta el programa con retardo de 10s 
        } catch (InterruptedException ex) {
            Logger.getLogger(Example_3.class.getName()).log(Level.SEVERE, null, ex);
        }
        int fila = 4;
        int columna = 5;
        int[][] number = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                number[i][j] = (int) ((Math.random()*99)+100);
            }
        }
        System.out.print(" ");
        for (int i = 0; i < 6; i++) {
            System.out.print("|------");
        }
        System.out.println("|");
        for (int i = 0; i < fila; i++) {
            int sumaHorizontal = 0;
            for (int j = 0; j < columna; j++) {
                sumaHorizontal += number[i][j];
                System.out.print(" |  " + number[i][j]);
                
            }
            System.out.print(" |=" + sumaHorizontal+"  |");
            System.out.println();
        }
        System.out.print(" ");
        for (int i = 0; i < 6; i++) {
            System.out.print("|------");
        }
        System.out.print("|");
        System.out.println();
        
        int aux[] = new int[5];
        int cont = 0;
        for (int j = 0; j < columna; j++) {
            int sumaVertical = 0;
            for (int i = 0; i < fila; i++) {
                sumaVertical += number[i][j];
            }
            System.out.print(" |=" + sumaVertical+" ");
            aux[cont] = sumaVertical;
            cont++;
        }

        System.out.print(" |");
        int sumaAux = 0;
        for (int i = 0; i < aux.length; i++) {
            sumaAux += aux[i];
        }
        System.out.print(" "+sumaAux +" |");
        System.out.println();
        System.out.print(" ");
        for (int i = 0; i < 7; i++) {
            System.out.print("------");
        }
        
    }
}
