/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_1 {
    public static void main(String[] args) {
        primes();
    }
    public static void primes(){
        String title = "busca los numeros capicua del 1 al 99999";
        System.out.println(title.toUpperCase());
        for (int i = 0; i <= 99999; i++) {
            String revert = (new StringBuilder(i+"").reverse().toString());
            if (String.valueOf(i).equals(revert)) {
                System.out.println("El numero " + String.valueOf(i) + " es igual a " + String.valueOf(revert) + " entoces es capicua");
            }else{
                System.out.println("El numero " + String.valueOf(i) + " no es igual a " + String.valueOf(revert) + " entoces no es capicua");
            }
        }
    }
}