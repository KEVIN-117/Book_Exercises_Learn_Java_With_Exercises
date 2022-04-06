/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6_3.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_9 {
    public static void main(String[] args) {
        int number = 0; 
        int i = 0;
        while (number != 24) {
            number = (int) (Math.random()*100);
            if(number % 2 == 0){
                System.out.print(number + ", ");
                i++;
            }
        }
        System.out.println();
        System.out.println("Se generaron " + i + " numeros");
    }
}
