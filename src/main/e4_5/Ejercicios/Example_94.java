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
public class Example_94 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        /*System.out.println(numero);
        int digito = numero % 10;
	numero = (numero/10);
        System.out.println(digito);
        System.out.println(numero);*/
        if(numero % 2 == 0 && numero % 10 ==5 || numero % 10 ==0){
            System.out.println("El numero " + numero + " es par y es divicible por 5");
        }else if(numero %10 ==5 || numero%10 ==0){
            System.out.println("El " + numero + " es divicible por 5");
        }
        
    }
}
