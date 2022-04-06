/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Arrays20_28;

/**
 *
 * @author krodr
 */
public class minimoArrayInt {
    public static int minimoarray(int tamaño, int rangeMinimun, int rangeMaximun){
        int[] array = new int[tamaño];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*rangeMaximun)+rangeMinimun;
        }
        System.out.print("[");
        int minimun = array.length-1;
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + ", ");
            if (minimun > array[i]) {
                minimun = array[i];
            }
        }
        System.err.print("]");
        System.out.println();
        System.out.print("El numero minimo del array es: ");
        return minimun;
        
    }
}
