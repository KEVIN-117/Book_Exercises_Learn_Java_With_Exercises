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
public class BuscaTesoro {
    final static int vacio = 0;
    final static int mina = 1;
    final static int tesoro = 2;
    final static int intento = 3;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int cuadrante[][] = new int [5][4];
        for ( x = 0; x < 4; x++) {
            for ( y = 0; y < 3; y++) {
                cuadrante[x][y] = vacio;
            }
        }
        int minaX = (int) (Math.random()*4);
        int minaY = (int) (Math.random()*3);
        cuadrante[minaX][minaY] = mina;
        
        int tesoroX;
        int tesoroY;
        
        do {            
            tesoroX = (int) (Math.random()*4);
            tesoroY = (int) (Math.random()*3);
        } while (minaX == tesoroX && minaY == tesoroY );
        
        cuadrante[tesoroX][tesoroY] = tesoro;
        
        System.out.println("Busca el tesoro ");
        boolean salir = false;
        String c = " ";
        
        do {            
            //pinta el cuadro
            for ( y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for ( x = 0; x < 5; x++) {
                    
                    if (cuadrante[x][y] == intento) {
                        System.out.print("X ");
                    }else{
                        System.out.print("  ");
                    }
                    
                }
                System.out.println();
            }
            System.out.println("   -----------\n 0 1 2 3 4\n ");
            
            //pide las coordenadas
            System.out.println("Coordenada X: ");
            x = input.nextInt();
            System.out.println("Coordenada Y: ");
            y = input.nextInt();
            
            switch (cuadrante[x][y]) {
                case vacio:{
                    cuadrante[x][y] = intento;
                    break;
                }
                case mina:{
                    System.out.println("Lo siento, as perdido");
                    break;
                }
                case tesoro:{
                    System.out.println("En horabuena, as ganado");
                    salir = true;
                    break;
                }
            }
        } while (!salir);
        //pinta el cuadrante
        for ( y = 3; y >= 0; y--) {
            System.out.print(y + "|");
            for ( x = 0; x < 5; x++) {
                
                switch (cuadrante[x][y]) {
                    case vacio:{
                        c = " ";
                        break;
                    }
                    case mina:{
                        c = "* ";
                        break;
                    }
                    case tesoro:{
                        c = "€ ";
                        break;
                    }
                    case intento:{
                        c = "x ";
                        break;
                    }
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("   -----------\n 0 1 2 3 4\n ");
    }
}
