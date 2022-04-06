/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_2 {
    public static void main(String[] args) {
        String title = "Este programa convierte binario a numeros decimales";
        System.out.println(title.toUpperCase());
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero binario: ");
        String binari = input.next();
        
        convertToDec(binari);
    }
    public static void convertToDec(String binari){
        String[] arrayOfBinary = binari.split("(?<=.)");
        int powers = 0;
        int[] arrayOfPowers = new int[arrayOfBinary.length];
        int contador = 0;
        int lengthOfArrayOfPowers = arrayOfPowers.length-1 ;
        
        // toma como base 2 y como exponente a i que se imcrementa
        for (int i = 0; i < arrayOfBinary.length; i++) {
            powers = (int) Math.pow(2, i);
            arrayOfPowers[contador] = powers;
            contador++;
        }
        
        //Guarda los elemntos del arreglo arrayOfPowers en el arreglo arrayOfPowersAids invierte el orden 
        int[] arrayOfPowersAids = new int[arrayOfBinary.length];
        int counterAux = 0; 
        for (int i = lengthOfArrayOfPowers; i > -1; i--) {            
            int index = arrayOfPowers[i];
            arrayOfPowersAids[counterAux] = index;
            counterAux++;
        }
        //busca ceros en arrayOfBinary y si lo encuentra en la misma posicion de arreglo
        //arrayOfPowersAids lo reemplaza con un 0
        int counterZeros = 0;
        for (int i = 0; i < arrayOfBinary.length; i++) {
            if (arrayOfBinary[i].equals("0")) {
                arrayOfPowersAids[i] = 0;
            }
            
        }
        
        //Sumamos todos los elementos del arreglo arrayOfPowersAids
        int sumArrayOfNumbers = 0;
        for (int i = 0; i < arrayOfPowersAids.length; i++) {
            sumArrayOfNumbers += arrayOfPowersAids[i];
        }
        System.out.println();
        System.out.println(String.valueOf(sumArrayOfNumbers));
        
        
    }
}
