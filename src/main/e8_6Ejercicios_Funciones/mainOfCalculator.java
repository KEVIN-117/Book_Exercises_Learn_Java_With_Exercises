/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class mainOfCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite el numero decimal que quiere convertir: ");
        int number = input.nextInt();
        System.out.print("Decimal     : " + number);
        System.out.println("Hexadecimal : " + e8_6Ejercicios_Funciones.CalculatorOfConvertToNumbers.ConvertToHexadecimal.convertHexadecimal(number));
        System.out.println("Octal       : " + e8_6Ejercicios_Funciones.CalculatorOfConvertToNumbers.ConvertToOctal.convert(number));
        System.out.println("Bynario     : " + e8_6Ejercicios_Funciones.CalculatorOfConvertToNumbers.ConvertToBinary.convertToBinary(number));
    }
}
