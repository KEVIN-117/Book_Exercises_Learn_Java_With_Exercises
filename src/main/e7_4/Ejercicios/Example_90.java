/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e7_4.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_90 {
    public static void main(String[] args) {
        int[] number = new int[20];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ", ");
        }
        System.out.println();
        int aux[] = new int[20];
        int contador = 0;
        int contadorPares = 0;
        int contarImpares = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]%2 == 0){
                aux[contador] = number[i];
                contador++;
                contadorPares++;  
            }
        }
        
        for (int i = 0; i < number.length; i++) {
            if(number[i]%2 != 0){
                aux[contador] = number[i];
                contador++;
                contarImpares++;  
            }
        }
        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + ", ");
        }
        System.out.println();
        System.out.println("total de numeros " + contador);
        System.out.println("Total de numeros pares " + contadorPares);
        System.out.println("Total de numeros Impares " + contarImpares);
        
    }
}
