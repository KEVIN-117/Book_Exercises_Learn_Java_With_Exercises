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
public class Example_8 {
    public static void main(String[] args) {
        System.out.println("PROGRAMA QUE CALCULA LA MEDIA DE 3 NOTAS");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 3 notas: ");
        double nota1 = input.nextInt();
        double nota2 = input.nextInt();
        double nota3 = input.nextInt();
        double media = (nota1+nota2+nota3)/3;
        System.out.println("La nota es: " + media);
        if(media <=50){
            System.out.println("INSUFICIENTE");
        }else if(media==60 ){
            System.out.println("BIEN");
        }else if(media >=70 && media<=80){
            System.out.println("NOTALE");
        }else if(media == 100){
            System.out.println("EXELENTE");
        }
    }
}
