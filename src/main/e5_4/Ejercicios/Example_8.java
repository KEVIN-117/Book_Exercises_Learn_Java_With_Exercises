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
public class Example_8 {
    public static void main(String[] args) {
        System.out.println("Tabla de multiplicar");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int number = input.nextInt();
        System.out.println("-------------------------------------------");
        int i=0;
        while (i<10) {            
            i++;
            System.out.println(i + " * " + number+ " = " + i*number);
        }
    }
}
