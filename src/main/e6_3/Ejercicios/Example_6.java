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
public class Example_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = (int) (Math.random()*100);
        for (int i = 5; i > 0; i--) {
            System.out.println("Tienes " + i + " intentos ");
            System.out.println("Digite un numero: ");
            int digit = input.nextInt();
            if(digit > number){
                System.out.println("El numero " + digit + " es mayor al numero secreto");
            }else if(digit < number){
                System.out.println("El numero " + digit + " es menor al numero secreto");
            }else if(digit == number){
                System.out.println("¡Felicidades as encontrado el numero secreto " + digit + " es  igual a " + number);
                break;
            }
            
        }
    }
}
