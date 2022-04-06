/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Arrays20_28;

/**
 *
 * @author krodr
 */
public class mediaArrayInt {
    public static double media(int lenth, int rangeMinimun, int rangeMaximun){
        int[] array = new int[lenth];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*rangeMaximun)+rangeMinimun;
        }
        double sumElemnetsArray = 0;
        double div = 0;
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + ", ");
            sumElemnetsArray += array[i];
            div++;
        }
        System.out.print("]");
        System.out.println();
        System.out.print("La media del array es: ");
        return sumElemnetsArray/div;
        
    }
}
