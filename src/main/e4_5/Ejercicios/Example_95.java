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
public class Example_95 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--INDIQUE LA OPCION QUE DECEE--");
        System.out.println("1.- vertice hacia arriba");
        System.out.println("2.- vertice hacia abajo");
        System.out.println("3.- vertice hacia derecha");
        System.out.println("4.- vertice hacia izquierda");
        int option = input.nextInt();
        
        switch (option) {
            case 1:
                System.out.println("   * ");
                System.out.println("  ***");
                System.out.println(" *****");
                System.out.println("*******");
                break;
            case 2:
                System.out.println("******* ");
                System.out.println(" *****");
                System.out.println("  ***");
                System.out.println("   *  ");
                break;
            case 3:
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * * ");
                System.out.println("* * * *");
                System.out.println("* * * ");
                System.out.println("* *");
                System.out.println("*");
                break;


            case 4:
                System.out.println("      *");
                System.out.println("    * *");
                System.out.println("  * * *");
                System.out.println("* * * *");
                System.out.println("  * * *");
                System.out.println("    * *");
                System.out.println("      *");
                break;
        }
        
        
    }
}
