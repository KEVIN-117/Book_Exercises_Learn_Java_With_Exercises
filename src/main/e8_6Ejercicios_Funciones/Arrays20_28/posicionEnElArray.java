/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Arrays20_28;

/**
 *
 * @author krodr
 */
public class posicionEnElArray {
    public static int posicion(int Search, int length, int rangeMinimun, int rangeMaximun){
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*rangeMaximun)+rangeMinimun;
        }
        System.out.print("[");
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Search) {
                position = i;
                System.out.println("\"" + array[i] + "\"");
            }
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
        System.out.print("El numero se encunetra en la posicion: ");
        return position;
        
    }
}
