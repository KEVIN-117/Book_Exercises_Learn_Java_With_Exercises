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
public class ConvertToOctal {
    public static int convert(int number) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            int res = (int) Math.pow(8, i);
            if (res < number) {
                array.add(res);
            }else{
                break;
            }
        }
        int revert = array.size()-1;
        int auxNumber = number;
        String printNumverOctal = "";
        for (int i = revert; i > -1; i--) {
            int div = auxNumber/array.get(i);
            int multi = div*array.get(i);
            int resta = auxNumber - multi;
            auxNumber = resta;
            printNumverOctal = printNumverOctal+""+div;
        }
        return Integer.parseInt(printNumverOctal);
    }
}
