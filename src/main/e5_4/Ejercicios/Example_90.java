/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e5_4.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_90 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner input = new Scanner(System.in);
        int number = 0;
        int div = number;
        int contador = 0;
        do {            
            System.out.println("Ingrese un numero y -1 para parar el rpograma: ");
            number = input.nextInt();
            div = div + number;
            contador++;
            
        } while (number != -1);
        System.out.println("La suma de los numeros es " + div + " y el total de numeros introducidos es " + contador);
        System.out.println("la media del numero " + div + " es " + (double)(div/contador));
    }
}
