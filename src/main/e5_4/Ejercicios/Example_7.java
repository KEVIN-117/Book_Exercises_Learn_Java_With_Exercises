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
public class Example_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 4; i >= 0; i= i-1) {
            System.out.println("Digite la contraceña: ");
            int numero  = input.nextInt();
            if(numero == 1234){
                System.out.println("La caja fuerte se a abierto satisfactoriamente ");
                break;
            }else{
                System.out.println("Lo siento esa no es la combinacion " + i + " intentos");
                
            }
        }
    }
}
