/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e7_4.Ejercicios.ArraysBidimencionales;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fila = 4;
        int columna = 5;
        int[][] number = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.println("Ingrese un numero (" + i + " , " + j+")");
                number[i][j] = input.nextInt();
            }
        }
        /*
        Recorremos el array number[][] horizontalmente
        */
        for (int i = 0; i < fila; i++) {
            int suma = 0;
            for (int j = 0; j < columna; j++) {
                
                if(number[i][j]/10 == 0 ){//agregara doble espacio number[i][j]/10 es igual a 0
                    System.out.print("  ");
                }else if(number[i][j]/10 != 0){//agregara un espacio number[i][j]/10 no es igual a 0
                    System.out.print(" ");
                }
                System.out.print(number[i][j] + "  ");//Imprime el array number[][]
                suma += number[i][j];//Suma todos los numeros de array number[][] Horizontalmente;
            }
            System.out.println("|=" + suma);
        }
        for (int i = 0; i < 6; i++) {
            System.out.print("----|");
        }
        System.out.print("----");
        System.out.println();
        
        //---------------------------------------------------------------------//
        int aux[] = new int[5];
        int contador = 0;
        /*
        Recorremos el array verticalmente
        */
        for (int j = 0; j < columna; j++) {
            int suma2 =0;
            for (int i = 0; i < fila; i++) {
                suma2 += number[i][j];//Suma todos los numeros de array number[][] verticalmente;
            }
            //Guaardamos los resultados de la suma2 en el array suma2
            aux[contador] = suma2;
            contador++;
            System.out.print(suma2 + " |");
        }
        //Suma el array aux 
        int sumaAux = 0;
        for (int i = 0; i < aux.length; i++) {
            sumaAux += aux[i];
        }
        System.out.print(sumaAux);
    }
}
