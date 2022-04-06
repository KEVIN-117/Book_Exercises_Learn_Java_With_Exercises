/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6_3.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_93 {
    public static void main(String[] args) {
        boolean verdadero = true;
        while (verdadero) {            
            int number = (int) ((Math.random()*6)+1);
            int number2 = (int) ((Math.random()*6)+1);
            if (number == number2) {
                verdadero = false;
                System.out.println(number + ", " + number2);
            }
        }
    }
}
