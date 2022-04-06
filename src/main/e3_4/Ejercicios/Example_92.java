/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e3_4.Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen: ");
        double  nota = input.nextDouble();
        System.out.println("¿Que nota quieres sacar en el semestre?");
        double promedio = input.nextDouble();
        double nota2 = ((promedio-(nota*0.40))/0.60);
        DecimalFormat nota2Round = new DecimalFormat("#.##");
        System.out.println("Para sacar una nota de " + promedio + " en el semestre debes sacar un " 
                            + nota2Round.format(nota2) + " en el segundo examen");
    }
}
