/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6_3.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_2 {
    public static void main(String[] args) {
        
        int number = (int)(Math.random()*13)+1;
        
        switch (number) {
            case 1:{
                System.out.println("A");
                break;
            }
            case 2:{
                System.out.println("2");
                break;
            }
            case 3:{
                System.out.println("3");
                break;
            }
            case 4:{
                System.out.println("4");
                break;
            }
            case 5:{
                System.out.println("5");
                break;
            }
            case 6:{
                System.out.println("6");
                break;
            }
            case 7:{
                System.out.println("7");
                break;
            }
            case 8:{
                System.out.println("8");
                break;
            }
            case 9:{
                System.out.println("9");
                break;
            }
            case 10:{
                System.out.println("10");
                break;
            }
            case 11:{
                System.out.println("J");
                break;
            }
            case 12:{
                System.out.println("Q");
                break;
            }
            case 13:{
                System.out.println("K");
                break;
            }
            
                
            default:
                throw new AssertionError();
        }
    }
}
