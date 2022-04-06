/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6_3.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_96 {
    public static void main(String[] args) {
        int fig1 = 0;
        int fig2 = 0;
        int fig3 = 0;
        for (int i = 0; i < 3; i++) {
            int number = (int) ((Math.random()*5)+1);
            switch (number) {
                case 1:{
                    System.out.print("Corazon, ");
                    break;
                }
                case 2:{
                    System.out.print("Diamante, ");
                    break;
                }
                case 3:{
                    System.out.print("Herradura, ");
                    break;
                }
                case 4:{
                    System.out.print("Campana, ");
                    break;
                }
                case 5:{
                    System.out.print("Limon, ");
                    break;
                }
            }
            if (i == 0) {
                fig1 = number;
            }else if(i == 1){
                fig2 = number;
            }else if(i == 2){
                fig3 = number;
            } 
        }
        System.out.println();
        if ((fig1 == fig2 && fig1 == fig3) || (fig2 == fig1 && fig2 == fig3) || (fig3 == fig1 && fig3 == fig2)) {
            System.out.println("En horabuena, a ganado 10 monedas");
        }else if((fig1 == fig2 ) || (fig1 == fig3) || (fig2 == fig3)){
            System.out.println("Bien a recuperado su moneda");
        }else {
            System.out.println("Lo siento a perdido");
        }
    }
}
