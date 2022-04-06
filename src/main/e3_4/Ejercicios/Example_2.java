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
public class Example_2 {
    public static void main(String[] args) {
        //Programa que convierte euros a bolivianos
        Scanner input = new Scanner(System.in);
        System.out.println("Introdusca la cantidad de euros a convertir: ");
        int euro = input.nextInt();
        double bolivianos = 7.83;
        //1 euro= 7.83Bs
        double convert = euro*bolivianos;
        System.out.println(euro + "€ euros en bolivianos es " + convert + "Bs" );
    }
}
