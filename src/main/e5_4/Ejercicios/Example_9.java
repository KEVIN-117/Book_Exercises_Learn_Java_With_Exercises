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
public class Example_9 {
    public static void main(String[] args) {
        System.out.println("Contando los digitos de un numero");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero");
        int number = input.nextInt(); 
        int div = number;
        int contador = 0;
        while(div > 0) {
            div =  div / 10;
            contador ++;
        }
        System.out.println("El numero " + number + " tiene " + contador + " digitos");
    }
}
