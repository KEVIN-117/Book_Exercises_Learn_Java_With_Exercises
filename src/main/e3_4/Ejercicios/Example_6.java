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
public class Example_6 {
    public static void main(String[] args) {
        System.out.println("-PROGRAMA PARA ALCULAR EL AREA DE UN TRINAGULO-");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo: ");
        int base = input.nextInt();
        System.out.println("Ingrese la altura del triangulo: ");
        int altura = input.nextInt();
        
        System.out.println("El area del triangulo es :" + ((base * altura) /2));
        
    }
}
