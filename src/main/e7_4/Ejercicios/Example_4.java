/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e7_4.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for (int i = 0; i < 20; i++) {
            numero[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < 20; i++) {
            cuadrado[i] = numero[i]*numero[i];
        }
        for (int i = 0; i < 20; i++) {
            cubo[i] = cuadrado[i]*numero[i];
        }
        System.out.println("");
        System.out.print("Numero:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numero[i] + " ");
        }
        System.out.println("");
        System.out.print("Cuadrado:");
        for (int i = 0; i < 20; i++) {
            System.out.print(cuadrado[i] + " ");
        }
        System.out.println("");
        System.out.print("Cubo:");
        for (int i = 0; i < 20; i++) {
            System.out.print(cubo[i]+" ");
        }
    }
}
