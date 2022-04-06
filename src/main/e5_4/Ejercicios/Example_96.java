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
public class Example_96 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero para verificar si es primo o no : ");
        int number = input.nextInt();
        for (int i = 2; i <= number; i++) {
            if(number % i == 0 ){
                System.out.println("no es primo");
                break;
            }else{
                System.out.println("El numero " + number + " es primo ");
                break;
            }
        }
    }
}
