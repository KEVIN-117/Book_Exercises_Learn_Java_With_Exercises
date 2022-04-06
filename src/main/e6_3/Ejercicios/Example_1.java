/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6_3.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_1 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <=3; i++) {
            int number = (int)((Math.random()*6)+1);
            System.out.print(number + " ");
            suma += number;
        }
        System.out.println("");
        System.out.println("la suma es " + suma);
    }
}
