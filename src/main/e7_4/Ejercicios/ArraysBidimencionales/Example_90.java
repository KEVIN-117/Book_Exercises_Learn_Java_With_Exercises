/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e7_4.Ejercicios.ArraysBidimencionales;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int fila = 3;
        int columna = 3;
        String array[][] =  new String[fila][columna];
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                array[i][j] = String.valueOf(-1);
            }
        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        boolean isTrue = true;
        int contadorHorizontal = 0;
        //String [] ganaHorizontal = new String[contadorHorizontal];
        
        int contadorVertical = 0;
        //String [] ganaVertical = new String[contadorVertical];
        
        do {            
            System.out.println("Coordenada x (ingrese -1 al momento de ingresar el caracter para terminar el juego)");
            int x = input.nextInt();
            System.out.println("Coordenada y (ingrese -1 al momento de ingresar el caracter para terminar el juego)");
            int y = input.nextInt();

            System.out.println("Ingrese EL sigiuiente caracter [X] o [M] (ingrese -1 para terminar el juego)");
            String caracter = input.next();
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    if (array[i][j].equals(String.valueOf(-1))) {
                        array[x][y] = caracter;
                    }else if(array[i][j] == "M" || array[i][j] == "X" ){
                        System.out.println("Lo siento, esta ocupado");
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            
            
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    if (array[i][j].equals("M") || array[i][j].equals("X")) {
                        contadorHorizontal++;
                    }
                }
                
            }
            for (int j = 0; j < columna; j++) {
                for (int i = 0; i < fila; i++) {
                    if (array[i][j].equals("M") || array[i][j].equals("X")) {
                        contadorVertical++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    if( array[i][j] !=  "-1"){
                        continue;
                        
                    }
                }
            }
            isTrue = false;
            
            
        } while (isTrue);
        
            if (contadorHorizontal == 3) {
                System.out.println("gana");
            }
        
            if (contadorVertical == 3) {
                System.out.println("gana");
            }
        
    }
}
