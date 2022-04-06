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
public class Example_3 {
    public static void main(String[] args) {
        //programa que convirte bolivianos a euros
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de bolivianos a convertir: ");
        int boliviano = input.nextInt();
        double euro = 0.13;
        double convert = boliviano*euro;
        System.out.println(boliviano + "Bs en euros es " + convert + " €");
    }
}
