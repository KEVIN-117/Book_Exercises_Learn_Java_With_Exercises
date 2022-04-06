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
public class Example_97 {
    public static void main(String[] args) {
        System.out.println("PROGFRAMA QUE MUESTRA LA ULTIMA CIFRA DE UN NUMERO");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = input.nextInt();
        System.out.println("La ultima sifra del " + numero + " es " + numero%10);
    }
}
