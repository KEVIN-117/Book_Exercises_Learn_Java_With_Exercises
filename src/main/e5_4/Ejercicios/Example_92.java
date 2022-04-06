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
public class Example_92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int number = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        for (int i = 0; i < number; ++i) {
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;
            System.out.println(sum);
        }
    }
}
