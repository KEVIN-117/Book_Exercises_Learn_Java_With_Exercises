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
public class Example_97 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int number = input.nextInt();
        if(number < 0){
            System.out.println("¡ POSITIVO E DICHO !");
        }else{
            System.out.println("La suma de los  100  siguientes numeros a " + number + " son: ");
            for (int i = number; i <= number+100; i=i+1) {
            System.out.print(i + ", ");
            if(i%10 == 0){
                System.out.println("\n");
            }
            
        }
        }
        
    }
}
