/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Arrays20_28;

/**
 *
 * @author krodr
 */
public class maximoArrayInt {
    public static int maximunArray(int lenth, int rangeMinimun, int rangeMaximun){
        int[] array = new int[lenth];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*rangeMaximun)+rangeMinimun;
        }
        int maximun = 0;
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
            if (array[i] > maximun) {
                maximun = array[i];
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.print("El numero maximo del array es: ");
        return maximun;
        
    }
}
