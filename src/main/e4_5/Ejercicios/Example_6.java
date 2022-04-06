/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4_5.Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_6 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA CALCULAR EL TIEMPO QUE TARDA EN CAER UN OBJETO DESDE UNA ALTURA H");
        Scanner input = new Scanner(System.in);
        final double g = 9.81;
        System.out.println("Ingrese la altura H en (m): ");
        double h = input.nextDouble();
        double t = Math.sqrt(2*h/g);
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println("t = " + format.format(t) + "s");
    }
}
