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
public class Example_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base imponible: ");
        int Base = input.nextInt();
        double IVA = 0.13;
        System.out.println("Base imponible (Ventas al mes ) " + Base       );
        System.out.println("Debito Fiscal   (IVA (13%)    ) " + "*"+IVA    );
        System.out.println("----------------------------------------------");
        System.out.println("Total a pagar                   " + (Base*IVA) );
    }
    
}
