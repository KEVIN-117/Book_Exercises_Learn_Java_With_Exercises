/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e7_4.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_95 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesa[] = new int [10];
        for (int i = 0; i < mesa.length; i++) {
            mesa[i] = (int) (Math.random()*4);
        }
        for (int i = 0; i < 11; i++) {
            System.out.print("---------");
        }
        System.out.println();
        System.out.print("|  No   |");
        for (int i = 0; i < mesa.length; i++) {
            System.out.print("|   " + i + "   |");
        }
        System.out.println();
        for (int i = 0; i < 11; i++) {
            System.out.print("|-------|");
        }
        System.out.println();
        System.out.print("|Cliente|");
        for (int i = 0; i < mesa.length; i++) {
            System.out.print("|   " + mesa[i] + "   |");
        }
        System.out.println();
        for (int i = 0; i < 11; i++) {
            System.out.print("---------");
        }
        System.out.println();
        int personNumber = 0;
        do {   
            System.out.println("¿Cuantos son ? (introduce -1 para salir del programa): ");
            personNumber = input.nextInt();
            for (int i = 0; i < mesa.length; i++) {
                int suma = mesa[i] + personNumber;
                if(mesa[i] == 0){
                    System.out.println("Por favor pase a la mesa " + i);
                    mesa[i] = personNumber;
                    break;
                }if (personNumber > 4) {
                    System.out.println("Lo siento, no admitimnos grupos de " + personNumber + ", haga grupos de 4 como maximo e intentelo de nuevo");
                    break;
                }if(suma <=4){
                    System.out.println("Por favor pase a la mesa " + i);
                    mesa[i] = suma;
                    break;
                }
            }
            for (int i = 0; i < 11; i++) {
            System.out.print("---------");
            }
            System.out.println();
            System.out.print("|  No   |");
            for (int i = 0; i < mesa.length; i++) {
                System.out.print("|   " + i + "   |");
            }
            System.out.println();
            for (int i = 0; i < 11; i++) {
                System.out.print("|-------|");
            }
            System.out.println();
            System.out.print("|Cliente|");
            for (int i = 0; i < mesa.length; i++) {
                System.out.print("|   " + mesa[i] + "   |");
            }
            System.out.println();
            for (int i = 0; i < 11; i++) {
                System.out.print("---------");
            }
            System.out.println();
            
        } while (personNumber != 0);
        
    }
}
