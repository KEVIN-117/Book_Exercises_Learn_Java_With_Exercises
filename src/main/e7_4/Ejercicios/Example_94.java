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
public class Example_94 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String[] palabras = new String[8];
        String[] palabras = {"casa", "azul", "verde", "orden", "morado", "bombilla", "bici", "rosa"};
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        /*int cont = 9;
        for (int i = 0; i < palabras.length; i++) {
            cont -=1;
            System.out.println("Ingrese una palabra "+ cont+" : ");
            palabras[i] = input.next();
        }*/
        System.out.println("Array Original");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("-----------");
        }
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("|    " + i + "    |");
        }
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("|---------|");
        }
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            
            System.out.print("|  "+ palabras[i] + "  |");
            
        }
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("-----------");
        }
        System.out.println();
        String array[] = new String[8];
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < colores.length; j++) {
                if (palabras[i].equals(colores[j]) ) {
                    array[contador] = palabras[i];
                    palabras[i] = " ";
                    contador++;
                }
            }
        }
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] != " ") {
                array[contador] = palabras[i];
                contador++;
            }
        }
        
        
        System.out.println("\n ");
       
        System.out.println("Array Resultante");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("-----------");
        }
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("|    " + i + "    |");
        }
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("|---------|");
        }
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            
            System.out.print("|  "+ array[i] + "  |");
            
        }
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("-----------");
        }
    }
}
