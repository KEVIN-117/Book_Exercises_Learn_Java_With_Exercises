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
public class Example_5 {
    public static void main(String[] args) {
        System.out.println("Calcular el area de un rectangulo");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la altura: ");
        int altura = input.nextInt();
        System.out.println("Ingrese el Area: ");
        int base = input.nextInt();
        System.out.println("El area del rectangulo es : " + base*altura);
    }
}
