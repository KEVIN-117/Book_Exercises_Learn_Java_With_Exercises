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
public class Example_94 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero para la cantidad de ejercicios a realizar: ");
        int pruebas = input.nextInt();
        int contar = pruebas;
        for (int i = 1; i <= pruebas; i++) {
            System.out.println("Tienes " + contar + " intentos");
            System.out.println("Digite una base y un exponente (Entero positivo): ");
            int base = input.nextInt();
            int exponente = input.nextInt();
            System.out.println("El numero con base " + base + " y  con exponente " + exponente 
                                                    + " es igual " + Math.pow(base, exponente));
            contar--;
        }
        System.out.println("EL PROGRAMA TERMINO");
    }
}
