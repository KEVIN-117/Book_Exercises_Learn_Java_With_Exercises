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
public class Example_93 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cantidad = 10;
        int contarPositivos = 0;
        int contarNegativos = 0;
        for (int i = 0; i <= cantidad; i++) {
            System.out.println("Digite un numero: ");
            int nuber = input.nextInt();
            if(nuber < 0){
                contarNegativos++;
            }
            else{
                contarPositivos++;
            }
        }
        System.out.println("Hay " + contarPositivos + " numeros positivos y " + contarNegativos + " numeros negativos en la lista");
    }
}
