/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6_3.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_5 {
    public static void main(String[] args) {
        int max = 0;
        int min = 199;
        int div = 0;
        int divisor = 0;
        for (int i = 0; i < 50; i++) {
             int number = (int)(Math.random()*100)+100;
            System.out.print(number + ", ");
            if(number > max){
                max = number;
            }else if(number < min){
                min = number;
            }
            div += number;
            divisor++;
        }
        System.out.println();
        System.out.println("maximo " + max);
        System.out.println("minimo " + min);
        System.out.println("media " + (double)(div/divisor));
        
    }
}
