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
public class Example_91 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el mes y el dia: ");
        String mes = input.next();
        int dia = input.nextInt();
        System.out.println(" " + mes +" " + dia);
        
        for (int i = 0; i <= 30; i++) {
            System.out.println("" + i);
        }
    }
}
