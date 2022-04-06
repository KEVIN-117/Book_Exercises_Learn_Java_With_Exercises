/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class mainExamplesOfArrays {
    public static void main(String[] args) {
        int instance = 0;
        Scanner input = new Scanner(System.in);
        do { 
            System.out.print("\n::");
            System.out.print("\n::");
            System.out.println("1.-Generar un array\n2.-Buscar el numero minimo en el array\n3.-Buscar el numero maximo en el array\n4.-Sacar la media del array\n5.-Buscar un numero en el array\n6.-Posicion en el array\n7.-Voltear el array\n8.-Rotar a la derecha el array\n9.-Rotar a la izquierda el array");
            instance = input.nextInt();
            System.out.println("Digite la longitud del array: ");
            int lenthArray = input.nextInt();
            System.out.println("Digite el rango maximo de numeros que tendra su array: ");
            int rangeMax = input.nextInt();
            System.out.println("Digite el rango minimo de numeros que tendra su array: ");
            int rangeMin = input.nextInt();
            switch (instance) {
                case 1:{
                    System.out.println("Genrar ujn array");
                    System.out.println(e8_6Ejercicios_Funciones.Arrays20_28.generaArrayInt.genera(lenthArray, rangeMin, rangeMax));
                    break;
                }
                case 2:{
                    System.out.println("Buscar el numero minimo en el array");
                    System.out.println(e8_6Ejercicios_Funciones.Arrays20_28.minimoArrayInt.minimoarray(lenthArray, rangeMin, rangeMax));
                    break;
                }
                case 3:{
                    System.out.println("Buscar el numero maximo en el array");
                    System.out.println(e8_6Ejercicios_Funciones.Arrays20_28.maximoArrayInt.maximunArray(lenthArray, rangeMin, rangeMax));
                    break;
                }
                case 4:{
                    System.out.println("Sacar la media del array");
                    System.out.println(e8_6Ejercicios_Funciones.Arrays20_28.mediaArrayInt.media(lenthArray, rangeMin, rangeMax));
                    break;
                }
                case 5:{
                    System.out.println("Buscar un numero en el array");
                    System.out.println("digite el numero a buscar: ");
                    int searchNumber = input.nextInt();
                    System.out.println(e8_6Ejercicios_Funciones.Arrays20_28.estaEnArrayInt.isInArray(searchNumber, lenthArray, rangeMin, rangeMax));
                }
                case 6:{
                    System.out.println("Posicion de numero en el array");
                    System.out.println("Digite el numero par buscar la posicion: ");
                    int searchPosition = input.nextInt();
                    System.out.println(e8_6Ejercicios_Funciones.Arrays20_28.posicionEnElArray.posicion(searchPosition, lenthArray, rangeMin, rangeMax));
                    break;
                }
                case 7:{
                    System.out.println("Voltear el array");
                    System.out.println("Digite el numero de posiciones dl array para rotarlo: ");
                    int[] array = e8_6Ejercicios_Funciones.Arrays20_28.volteaArrayInt.voltear(lenthArray, rangeMin, rangeMax);
                    System.out.println("Array voletado\n[");
                    System.out.print("[");
                    for (int i = (array.length-1); i > -1; i--) {
                        System.out.print(array[i] + ", ");
                    }
                    System.out.println("]");
                    break;
                }
                case 8:{
                    System.out.println("Rotar a la derecha n posiciones el array");
                    System.out.println("Digite el numero de posiciones que rotatra el array: ");
                    int position = input.nextInt();
                    ArrayList<Integer> array = e8_6Ejercicios_Funciones.Arrays20_28.rotaDerechaArrayInt.rotar(position, lenthArray, rangeMax, rangeMin);
                    System.out.println("Array con " + position + " posiones rotados");
                    System.out.print("[");
                    for (int i = 0; i < array.size() ; i++) {
                        System.out.print(array.get(i) + ", ");
                    }
                    System.out.print("]");
                    break;
                }
                case 9:{
                    System.out.println("Rotar a la izquierda n posiciones el array");
                    System.out.println("Digite el numero de posiciones que rotatra el array: ");
                    int position = input.nextInt();
                    int[] array = e8_6Ejercicios_Funciones.Arrays20_28.rotarIzquierdaArrayInt.rotar(position, lenthArray, rangeMin, rangeMax);
                    System.out.println();
                    System.out.println("Array con rotacion a la izquierda");
                    System.out.print("[");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + ", ");
                    }
                    System.out.print("]");
                    break;
                }
            }
        } while (instance != 0);
    }
}
