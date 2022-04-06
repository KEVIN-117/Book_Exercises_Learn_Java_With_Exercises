/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e3_4.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los numeros");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println(number1 + " + " + number2 + " es "+(number1 + number2));
        System.out.println(number1 + " - " + number2 + " es "+(number1 - number2));
        System.out.println(number1 + " * " + number2 + " es "+ (number1 * number2));
        System.out.println(number1 + " / " + number2 + " es "+ (number1 / number2));
    }
}
