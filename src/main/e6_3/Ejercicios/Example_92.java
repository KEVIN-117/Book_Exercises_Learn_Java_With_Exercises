/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6_3.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_92 {
    public static void main(String[] args) throws InterruptedException{
        
        for (int i = 1; i > 0; i++) {
            for (int j = 0; j < 500; j++) {
                System.out.print((char)(Math.random()*126)+32);
            }
            System.out.println();
        }
    }
}
