/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e5_4.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_98 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite 2 numeros: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if(number1 > number2){
            System.out.println("El numero " + number1 + " es mayor a " + number2 );
            for (int i = number2; i <= number1; i = i+7 ) {
                System.out.println(i);
            }
        }else{
            System.out.println("El numero " + number2 + "es mayor a " + number1 );
            for (int i = number1; i <= number2; i = i+7 ) {
                System.out.println(i);
            
            }
        }

    }
}
