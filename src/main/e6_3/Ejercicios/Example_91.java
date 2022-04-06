/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6_3.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_91 {
    public static void main(String[] args) {
        int suspensos = 0;
        int suficientes = 0;
        int bien = 0;
        int notables = 0;
        for (int i = 0; i < 20; i++) {
            int notas = (int) ((Math.random()*10)+1);
            if(notas >= 0 && notas <=4){
                System.out.println("SUSPENSO");
                suspensos++;
            }else if(notas >=5 && notas <=6){
                System.out.println("SUFICIENTE");
                suficientes++;
            }else if(notas >= 7 && notas <=9){
                System.out.println("BIEN");
                bien++;
            }else if(notas == 10){
                System.out.println("NOTABLE");
                notables++;
            }
        }
        System.out.println();
        System.out.println("TOTAL");
        System.out.println("Suspensos: " + suspensos );
        System.out.println("Suficientes: " + suficientes);
        System.out.println("Bien: " + bien);
        System.out.println("Notables: " + notables);
    }
}
