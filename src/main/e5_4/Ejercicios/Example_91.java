/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e5_4.Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_91 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int number = input.nextInt();
        DecimalFormat format = new DecimalFormat("#");
        /*for (int i = number; i >= number-5 ; i = i-1) {
            
            System.out.println("El numero " + i + " el cuadrado es " + format.format(Math.pow(i, 2)) + " y el cubo " + format.format(Math.pow(i, 3)));
        }*/
        int i = number;
        while (i >= number-5) {            
            i = i-1;
            System.out.println("El numero " + i + " el cuadrado es " + format.format(Math.pow(i, 2)) + " y el cubo " + format.format(Math.pow(i, 3)));
        }
    }
}
