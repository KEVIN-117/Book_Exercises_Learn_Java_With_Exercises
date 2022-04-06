/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author krodr
 */
public class Example_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero decimal: ");
        String number = input.next();
        convertToBinari(number);
    }
    public static void convertToBinari(String number) {
        int numberConvert = Integer.parseInt(number);
        int n = numberConvert;
        int cifra = 0;
        ArrayList<Integer> array = new ArrayList<>();
        while (n != 0) {            
            cifra = n %2;
            n = n/2; 
            array.add(cifra);
        }
        int revert = array.size()-1;
        for (int i = revert; i > -1; i--) {
            System.out.print(String.valueOf(array.get(i)));
        }
        
        
        

        
    }
}
/*
int numberConvert =156;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i <= numberConvert; i++) {
            int power = (int) Math.pow(2, i);
            if (power > 156) {
                break;
            }
            array.add(power);
        }
        array.add(numberConvert);
        //Invertimos el array
        int[] arrayReverse = new int [array.size()];
        int contadorArrayReverse = 0;
        int reverse = array.size()-1;
        for (int i = reverse; i > -1; i--) {
            arrayReverse[contadorArrayReverse] = array.get(i);
            contadorArrayReverse++;
        }
        int response = 0;
        for (int i = 0; i < arrayReverse.length; i++) {
            for (int j = 1; j < arrayReverse.length; j++) {
                response = arrayReverse[i]-arrayReverse[j];
                response = response;
                System.out.println(arrayReverse[i]-arrayReverse[j]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Example_3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println(response);
*/