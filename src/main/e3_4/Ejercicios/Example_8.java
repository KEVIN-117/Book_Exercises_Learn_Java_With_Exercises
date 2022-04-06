/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e3_4.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el total de horas trabajadas: ");
        
        int horasTrabajo = input.nextInt();
        int salarioHora = 12;
        
        System.out.println("Horas de trabajo           -->" + horasTrabajo);
        System.out.println("El total de dias trabajado -->" + horasTrabajo*1/12 + " Dias");
        System.out.println("Salrio por hora            -->" + salarioHora );
        System.out.println("--------------------------------------------------------------");
        System.out.println("Total salario recivido     -->" + (horasTrabajo*salarioHora));
    }
}
