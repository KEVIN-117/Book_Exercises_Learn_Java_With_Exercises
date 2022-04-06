/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6_3.Ejercicios;

/**
 *
 * @author krodr
 */
public class Example_95 {
    public static void main(String[] args) {
        int numCompas = 4;
        do {            
            numCompas = (int) ((Math.random()*28)+4);
        } while (numCompas%4 != 0);
        String primera = "";
        for (int i = 0; i < numCompas; i++) {
            for (int j = 0; j < 4; j++) {
                int numberNota = (int) ((Math.random()*7)+1);
                String nota = "";
                switch (numberNota) {
                    case 1:{
                        nota = "do";
                        break;
                    }
                    case 2:{
                        nota = "re";
                        break;
                    }
                    case 3:{
                        nota = "mi";
                        break;
                    }
                    case 4:{
                        nota = "fa";
                        break;
                    }
                    case 5:{
                        nota = "sol";
                        break;
                    }
                    case 6:{
                        nota = "la";
                        break;
                    }
                    case 7:{
                        nota = "si";
                        break;
                    }
                }
                if(i==0 && j==0){
                    primera = nota;
                }else if(i== numCompas-1 && j==3){
                    nota = primera;
                }
                System.out.print(nota + " ");
            }
            System.out.print(" |");
        }
        System.out.print("|");
    }
}
