/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Arrays20_28;

/**
 *
 * @author krodr
 */
public class estaEnArrayInt {
    public static boolean isInArray(int searchNumber, int length, int rangeMinimun, int rangeMaximun){
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*rangeMaximun)+rangeMinimun;
        }
        //System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
            if (array[i] == searchNumber) {
                System.out.print("\"" + array[i] + "\", ");
                System.out.println();
                return true;
            }
        }
        System.out.println();
        return false;
        
    }
}
