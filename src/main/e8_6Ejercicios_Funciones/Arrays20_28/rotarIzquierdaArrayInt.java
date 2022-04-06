/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Arrays20_28;

import java.util.ArrayList;

/**
 *
 * @author krodr
 */
public class rotarIzquierdaArrayInt {
    public static int[] rotar(int position, int lengthArray, int rangeMinimun, int rangeMaximun){
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*rangeMaximun)+rangeMinimun;
        }
        System.out.println("Array original");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
        //copiamos el array al array aux[]
        int[] aux = new int[array.length];
        int counter = 0;
        for (int i =0; i < array.length ; i++) {
            aux[counter] = array[i];
            counter++;
        }
        //guardamos los elementos del array desde la posicion que se indica en  position
        int[] arrayList = new int[array.length];
        int counterarrayList = 0;
        for (int i = position; i < array.length ; i++) {
            arrayList[counterarrayList] = array[i];
            counterarrayList++;
        }
        //guardamos los elementos del array aux desde la posicion 0 
        //hasta la posicion que se indica con position
        for (int i = 0; i < position; i++) {
            arrayList[counterarrayList] = aux[i];
            counterarrayList++;
        }
        return arrayList;
        
    }
}
