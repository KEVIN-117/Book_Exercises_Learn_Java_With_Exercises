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
public class Example_9 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA QUE CALCULA LA ECUACION DE LA FORMA ax**2+bx+c=0");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese a, b, c: ");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double x1 = (-b + Math.sqrt(Math.pow(b,2) + 4*a*c))/2*a;
        double x2 = (-b - Math.sqrt(Math.pow(b,2) + 4*a*c))/2*a;
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println("X1 =" + format.format(x1));
        System.out.println("X2 =" + format.format(x2));
    }
}
