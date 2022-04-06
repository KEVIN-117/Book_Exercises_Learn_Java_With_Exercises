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
public class ConvertToBinary {
    public static String convertToBinary(int number){
        int aux = number;
        int residuo = 0;
        ArrayList<Integer> array = new ArrayList<>();
        while (aux != 0) {            
            residuo = aux % 2;
            aux = aux/2;
            array.add(residuo);
        }
        String printArray2 = "";
        for (int i = 0; i < array.size(); i++) {
            String printArray1 = String.valueOf(array.get(i));
            printArray2 = printArray1+""+printArray2;
        }
        return printArray2;
        
    }
    public static int convertToDecimal(String binary) {
        String[] array = binary.split("(?<=.)");
        int[] arrayOfPowers = new int[array.length];
        int counterArrayOfPowers = 0;
        for (int i = 0; i < array.length; i++) {
            int powers = (int) Math.pow(2, i);
            arrayOfPowers[counterArrayOfPowers] = powers;
            counterArrayOfPowers++;
        }
        int[] powersArray = new int[array.length];
        int counterPowersArray = 0;
        int revert = arrayOfPowers.length-1;
        for (int i = revert; i > -1; i--) {
            powersArray[counterPowersArray] = arrayOfPowers[i];
            counterPowersArray++;
        }
        for (int i = 0; i < powersArray.length; i++) {
            if (array[i].equals("0")) {
                powersArray[i] = 0;
            }
        }
        int sumElemntsArray = 0;
        for (int i = 0; i < powersArray.length; i++) {
            sumElemntsArray += powersArray[i];
        }
        return sumElemntsArray;
    }
}
