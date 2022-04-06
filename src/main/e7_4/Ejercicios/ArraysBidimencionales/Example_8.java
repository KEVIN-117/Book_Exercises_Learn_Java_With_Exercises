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
public class Example_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numeros[] = {"1", "2", "3", "4","5","6","7","8"};
        String caracteres[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
        
        
        int fila = 8;
        int columna = 8;
        String[][] array = new String[fila][columna];
        
        array[0][0]="8a"; array[0][1]="8b"; array[0][2]="8c"; array[0][3]="8d"; array[0][4]="8e"; array[0][5]="8f"; array[0][6]="8g"; array[0][7]="8h";  
        array[1][0]="7a"; array[1][1]="7b"; array[1][2]="7c"; array[1][3]="7d"; array[1][4]="7e"; array[1][5]="7f"; array[1][6]="7g"; array[1][7]="7h";  
        array[2][0]="6a"; array[2][1]="6b"; array[2][2]="6c"; array[2][3]="6d"; array[2][4]="6e"; array[2][5]="6f"; array[2][6]="6g"; array[2][7]="6h";  
        array[3][0]="5a"; array[3][1]="5b"; array[3][2]="5c"; array[3][3]="5d"; array[3][4]="5e"; array[3][5]="5f"; array[3][6]="5g"; array[3][7]="5h";  
        array[4][0]="4a"; array[4][1]="4b"; array[4][2]="4c"; array[4][3]="4d"; array[4][4]="4e"; array[4][5]="4f"; array[4][6]="4g"; array[4][7]="4h";  
        array[5][0]="3a"; array[5][1]="3b"; array[5][2]="3c"; array[5][3]="3d"; array[5][4]="3e"; array[5][5]="3f"; array[5][6]="3g"; array[5][7]="3h";  
        array[6][0]="2a"; array[6][1]="2b"; array[6][2]="2c"; array[6][3]="2d"; array[6][4]="2e"; array[6][5]="2f"; array[6][6]="2g"; array[6][7]="2h";  
        array[7][0]="1a"; array[7][1]="1b"; array[7][2]="1c"; array[7][3]="1d"; array[7][4]="1e"; array[7][5]="1f"; array[7][6]="1g"; array[7][7]="1h";  
        
        for (int i = 0; i < fila ; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("::");
            System.out.println("Que Quiere mover: \ntorre\ncaballo\nalfil\ndama\nrey\npeon\nescriba( terminar para salir): ");
            System.out.println("Diga que pieza quiere mover:");
            String palabra = input.next();
            System.out.print("Digite la posicion de " + palabra + "\n-->");
            String position = input.next();
            int indexRow = 0;
            int indexColumn = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j].equals(position)) {
                        indexRow = i;
                        indexColumn = j;
                    }
                }
            }
            switch (palabra) {
                case "torre":{
                    System.out.println("La torre puede moverse a las siguientes posiciones");
                    movimientosTorre(array, indexRow, indexColumn);
                    break;
                }
                case "caballo" :{
                    System.out.println("El caballo puede moverse a las siguientes posiciones:");
                        if (indexColumn-3 >= 0) {
                            if (indexRow+1 < array.length) {
                                System.out.print(array[indexRow+1][indexColumn-3] + " ");
                            }
                            if (indexRow-1 > 0) {
                                System.out.print(array[indexRow-1][indexColumn-3] + " ");
                            }
                        }
                        if (indexColumn+3 < array.length && indexRow+1 < array.length && indexRow-1 > 0) {
                            System.out.print(array[indexRow+1][indexColumn+3] + " ");
                            System.out.print(array[indexRow-1][indexColumn+3] + " ");
                        }
                        if (indexRow+3 < array.length && indexColumn-1 > 0 && indexColumn+1 < array.length) {
                            System.out.print(array[indexRow+3][indexColumn-1] + " ");
                            System.out.print(array[indexRow+3][indexColumn+1] + " ");
                        }
                        if (indexRow-3 >= 0 && indexColumn-1 > 0 && indexColumn+1 < array.length) {
                            System.out.print(array[indexRow-3][indexColumn-1] + " ");
                            System.out.print(array[indexRow-3][indexColumn+1] + " ");
                        }
                        

                    break;
                }
                case "alfil" :{
                    System.out.println("El alfil puede moverse a las siguientes posiciones:");
                    mivimietosAlfil(array, indexRow, indexColumn);
                    break;
                }
                case "dama" :{
                    System.out.println("La dama puede moverse a las siguientes posiciones:");
                    movimientosDama(array, indexRow, indexColumn);
                    break;
                }
                case "peon" :{
                    System.out.println("El peon puede moverse a:");
                    System.out.println(array[indexRow-1][indexColumn]);
                    break;
                }
            }
            if (palabra.equals("terminar")) {
                isTrue = false;
                break;
            }
        }
        for (int i = 0; i < fila ; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void movimientosDama(String[][] array, int indexRow, int indexColumn) {
        for (int i = 1; i < array.length; i++) {
            if (indexRow-i > 0) {
                System.out.print(array[indexRow-i][indexColumn-i] + " ");
            }
        } 
        for (int i = 1; i < array.length; i++) {
            if (indexRow+i < array.length) {
                System.out.print(array[indexRow+i][indexColumn+i] + " ");
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (indexRow-i >= 0) {
                System.out.print(array[indexRow-i][indexColumn+i] + " ");
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (indexRow+i < array.length && indexColumn-i >= 0) {
                System.out.print(array[indexRow+i][indexColumn-i] + " ");
            }
        }
        //recorre array horizontal 
        for (int i = 1; i < array.length; i++) {
            if (indexColumn+i < array.length) {
                System.out.print(array[indexRow][indexColumn+i] + " ");
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (indexColumn-i >= 0) {
                System.out.print(array[indexRow][indexColumn-i] + " ");
            }
        }
        //recorre array vertical
        for (int i = 1; i < array.length; i++) {
            if (indexRow-i >= 0) {
                System.out.print(array[indexRow-i][indexColumn] + " ");
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (indexRow+i < array.length) {
                System.out.print(array[indexRow+i][indexColumn] + " ");
            }
        }

                
    }

    private static void mivimietosAlfil(String[][] array, int indexRow, int indexColumn) {
        for (int i = 1; i < array.length; i++) {
            if (indexRow-i > 0) {
                System.out.print(array[indexRow-i][indexColumn-i] + " ");
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (indexRow+i < array.length) {
                System.out.print(array[indexRow+i][indexColumn+i] + " ");
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (indexRow-i >= 0 && indexColumn+i < array.length) {
                System.out.print(array[indexRow-i][indexColumn+i] + " ");
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (indexRow+i < array.length && indexColumn-i >= 0) {
                System.out.print(array[indexRow+i][indexColumn-i] + " ");
            }
        }
    }

    private static void movimientosTorre(String[][] array, int indexRow, int indexColumn) {
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[indexRow][i] + " ");
        }
        System.out.print(" ");
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i][indexColumn] + " ");
        }
    }
}
//https://codepen.io/darckbyte/full/OJzxXdV
