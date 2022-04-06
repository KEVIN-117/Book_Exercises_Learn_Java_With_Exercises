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
public class Example_7 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA QUE CALCULA LA MEDIA DE 3 NOTAS");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 3 notas: ");
        int nota1 = input.nextInt();
        int nota2 = input.nextInt();
        int nota3 = input.nextInt();
        System.out.println("La media es: " + (nota1+nota2+nota3)/3);
        
        
    }
}
