/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Arrays20_28;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class rotaDerechaArrayInt {
    public static ArrayList<Integer> rotar(int positionRotate, int lengthArray, int rangeMaximun, int rangeMinimun) {
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*rangeMaximun)+rangeMinimun;
        }
        System.err.println("Array original: ");
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(" ]");

        int[] aux = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            aux[counter] = array[i];
            counter++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = aux.length-positionRotate; i < aux.length ; i++) {
            list.add(aux[i]);
        }
        for (int i = 0; i < array.length-positionRotate; i++) {
            list.add(array[i]);
        }
        System.out.println();
        return list;
    }
}
