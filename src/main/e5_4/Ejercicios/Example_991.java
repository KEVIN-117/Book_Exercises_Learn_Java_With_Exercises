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
public class Example_991 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int contador = 0;
        int contarImpares = 0;
        int suma = 0 ;
        do {            
            number = number = input.nextInt();
            if(number%2 != 0){
                contarImpares++;
                suma = suma + number;
            }
            contador++;
        } while (number > 0);
        System.out.println(suma);
    }
}
