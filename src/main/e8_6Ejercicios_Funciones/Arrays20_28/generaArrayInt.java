/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.Arrays20_28;

/**
 *
 * @author krodr
 */
public class generaArrayInt {
    public static String genera(int tamaño, int intervaloMinimo, int intervaloMaximo){
        int[] array = new int[tamaño];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*intervaloMaximo)+intervaloMinimo;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        return "]";
        
    }
}
