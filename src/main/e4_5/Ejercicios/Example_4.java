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
public class Example_4 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas: ");
        int hora = input.nextInt();
        if(hora <= 40){
            System.out.println("Total pagado: " + hora*12 + "€");
        }else if(hora >=41){
            System.out.println("Total pagado: " + hora*16 + "€");
        }
    }
}
