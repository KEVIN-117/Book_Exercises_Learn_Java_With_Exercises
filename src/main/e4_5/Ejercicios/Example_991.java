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
public class Example_991 {
    public static void main(String[] args) {
        //Ejercicio 20 numeros capicuas
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = input.nextInt();
	int reverso = Integer.parseInt((new StringBuilder(numero+"")).reverse().toString());
        if(numero == reverso){
            System.out.println("El numero " + numero + " es igual que su reverso " + reverso + " entonces es numero capicua");
        }else{
            System.out.println("El numero " + numero + " no es capicua");
        }
    }
}
