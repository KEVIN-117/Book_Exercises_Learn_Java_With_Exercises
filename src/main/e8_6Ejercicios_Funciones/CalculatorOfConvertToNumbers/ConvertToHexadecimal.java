/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones.CalculatorOfConvertToNumbers;

import java.util.ArrayList;
/**
 *
 * @author krodr
 */
public class ConvertToHexadecimal {
    public static String convertHexadecimal(int number) {
        String[] arrayOfNotationHexadecimal = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayOfDec = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            int dec = (int) Math.pow(16, i);
            
            if (dec < number) {
                arrayOfDec.add(dec);
            }else{
                break;
            }
        }
        int reverseArray = arrayOfDec.size()-1;
        int numberAux = number;
        int resta = 0;
        for (int i = reverseArray; i >-1; i--) {
                int div = numberAux / arrayOfDec.get(i);
                int multi = div*arrayOfDec.get(i);
                resta = numberAux-multi;
                numberAux = resta;
                array.add(div);
                
        }
        array.add(resta);
        String auxArray[] = new String[array.size()];
        int contador = 0;
        System.out.println();
        for (int i = 0; i < array.size(); i++) {
            auxArray[contador] = String.valueOf(array.get(i));
            contador++;
        }
        
        for (int i = 0; i < auxArray.length; i++) {
            for (int j = 0; j < arrayOfNotationHexadecimal.length; j++) {
                if (auxArray[i].equals(String.valueOf(j)) ) {
                    auxArray[i] = arrayOfNotationHexadecimal[j];
                }
            }
        }
        String saveElementArray = "";
        for (int i = 0; i < auxArray.length; i++) {
            String aux = auxArray[i];
            saveElementArray = saveElementArray+""+aux;
        }
        return saveElementArray;
    }
}
