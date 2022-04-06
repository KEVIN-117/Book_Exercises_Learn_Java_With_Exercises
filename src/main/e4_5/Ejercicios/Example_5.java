/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4_5.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_5 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA RESOVER EJERCICIOS DE LA FORMA ax+b=0 donde a,b son numeros reales");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese para a: ");
        int a = input.nextInt();
        System.out.println("Ingrese para b: ");
        int b = input.nextInt();
        
        double x =-b/a;
        System.out.println("Entonces x=" + x);
    }
}
