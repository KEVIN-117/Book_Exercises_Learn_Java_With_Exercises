/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6_3.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_90 {
    public static void main(String[] args) {
        int caracter = (int) ((Math.random()*6)+1);
        switch (caracter) {
            case 1:{
                for (int i = 0; i < 10; i++) {
                    int numberLength = (int) ((Math.random()*40)+1);
                    for (int j = 0; j < numberLength; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    
                }
                break;
            }
            case 2:{
                for (int i = 0; i < 10; i++) {
                    int numberLength = (int) ((Math.random()*40)+1);
                    for (int j = 0; j < numberLength; j++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    
                }
                break;
            }
            case 3:{
                for (int i = 0; i < 10; i++) {
                    int numberLength = (int) ((Math.random()*40)+1);
                    for (int j = 0; j < numberLength; j++) {
                        System.out.print("=");
                    }
                    System.out.println();
                    
                }
                break;
            }
            case 4:{
                for (int i = 0; i < 10; i++) {
                    int numberLength = (int) ((Math.random()*40)+1);
                    for (int j = 0; j < numberLength; j++) {
                        System.out.print(".");
                    }
                    System.out.println();
                    
                }
                break;
            }
            case 5:{
                for (int i = 0; i < 10; i++) {
                    int numberLength = (int) ((Math.random()*40)+1);
                    for (int j = 0; j < numberLength; j++) {
                        System.out.print("|");
                    }
                    System.out.println();
                    
                }
                break;
            }
            case 6:{
                for (int i = 0; i < 10; i++) {
                    int numberLength = (int) ((Math.random()*40)+1);
                    for (int j = 0; j < numberLength; j++) {
                        System.out.print("@");
                    }
                    System.out.println();
                    
                }      
                break;
            }
            default:
                throw new AssertionError();
        }
    }
}
