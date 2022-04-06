/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6_3.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_94 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 100;
        int min = 0;
        int intentos = 1;
        int i = 6;
        boolean isTrue = true;
        while (i >= intentos && isTrue) {
            i--;
            System.out.println("Tienes " + i + " intentos");
            int number = (int) (Math.random()*(max - min + 1) + min);
            System.out.println("es el numero? " + number);
            System.out.println("Digita [s] si, [-] si tu numero es menor, [+] tu numero es mayor ");
            String response = "";
            response = input.next();
            switch (response) {
                case "s":{
                    isTrue = false;
                    System.out.println("El numero que pensaste es " + number);
                    break;
                }
                case "+":{
                    min = number+1;
                    break;
                }
                case "-":{
                    max = number - 1;
                    break;
                } 
                default:
                    throw new AssertionError();
            }
            if(i == 0){
                isTrue = false;
            }
        }
    }
}
