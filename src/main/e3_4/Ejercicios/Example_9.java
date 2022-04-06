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
public class Example_9 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA CALCULAR EL RADIO DE UN CONO");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la atura  del cono:  ");
        int altura = input.nextInt();
        System.out.println("Introduce el readio del cono: ");
        int radio  = input.nextInt();
        double result = (3.1416*((radio*radio)*altura))*1/3;
        System.out.println("El area del cono es: V = " + result);
    }
}
