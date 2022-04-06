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
public class Example_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una hora sin minutos: ");
        int hora = input.nextInt();
        if(hora>=6 && hora<=12 ){
            System.out.println("¡Buenos Dias!");
        }else if(hora >=13 && hora<=20){
            System.out.println("¡Buenas Tardes!");
        }else if(hora>=21 && hora<=5){
            System.out.println("¡Buenas Noches!");
        }
    }
}
