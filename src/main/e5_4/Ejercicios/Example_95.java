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
public class Example_95 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un numero real(base) y un numero entero (expónente): ");
        int base = input.nextInt();
        int exponente = input.nextInt();
       DecimalFormat format = new DecimalFormat("#");
        for (int i = 1; i <= exponente; i++) {
            System.out.println("El numero con base " + base + " y exponente " + i + " es : "+ format.format(Math.pow(base, i)));
        }
    }
}
