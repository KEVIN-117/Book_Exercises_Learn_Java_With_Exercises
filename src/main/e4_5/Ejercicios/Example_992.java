/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4_5.Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_992 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 21");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la nota del primer control: ");
        double primera = input.nextDouble();
        System.out.println("Ingrese la nota del segunda control: ");
        double segunda = input.nextDouble();
        double media = ((primera + segunda)/2);
        //DecimalFormat format = new DecimalFormat("#,##");
        if(media>5){
            System.out.println("Felicidades usted aprobo " + media);
        }else if(media <=5){
            System.out.println("¡OH! Que mal tendra que tomar el examen de rercuperacion");
            System.out.println("¿Cual a sido el resultado de la recuperacion? (apto/ no_apto)");
            String recuperacion = input.next();
            if(recuperacion.equals("apto")){
                System.out.println("Tu nota de programacion es " + 5);
            }else if(recuperacion.equals("no_apto")){
                System.out.println("Tu nota de programacion es " + media);
            }   
        }
    }
}
