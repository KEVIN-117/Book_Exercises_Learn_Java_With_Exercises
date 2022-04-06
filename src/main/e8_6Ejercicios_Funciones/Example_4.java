/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do {            
            opcion = input.nextInt();
            System.out.println("Digite la opcion que desea:\n1.-Convertir decimal a bynario\n2.-Convertir decimal a hexadecimal\n3.-Convertir decimal a octal");
        } while (opcion != 0);
    }
}
