/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e3_4.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_91 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la base imponible: ");
        int Base = input.nextInt();
        System.out.println("Intrduzca el tipo de IVA  general, reducido, superReducido");
        String iva = input.next();
        System.out.println("Introduzca el codigo promocional (nopro, mitad, meno5, 5porc");
        String codigo = input.next();
        // tipos iva 21%, iva 10%, iva 4%
        //tipos de promocion no se aplica promocion, precio se reduce a la mitad, se descuentan 5 euros, menos el 5%
        //------------IVA 21%------------
        if(iva.equals("general")){
            double iva21 = Base*0.21;
            double totalPrice = iva21+ Base;
            //-----------------CODIGO nopro------------
            if(codigo.equals("nopro")){
                int codigoPro = 0;
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(21%)       --> " + iva21);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + (totalPrice-codigoPro));
            //-----------------CODIGO mitad------------
            }else if(codigo.equals("mitad")){
                double codigoPro = (totalPrice/2);
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(21%)       --> " + iva21);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + codigoPro);
            
            //-----------------CODIGO meno5------------
            }else if(codigo.equals("meno5")){
                double codigoPro = (totalPrice-5);
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(21%)       --> " + iva21);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + codigoPro);
            //-----------------CODIGO 5porc------------
            }else if(codigo.equals("5porc")){
               double codigoPro = (totalPrice-0.05);
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(21%)       --> " + iva21);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + codigoPro);
            }
        }
        
        //------------IVA 10%------------
        if(iva.equals("reducido")){
            double iva10 = Base*0.10;
            double totalPrice = iva10+ Base;
            
            //-----------------CODIGO nopro------------
            if(codigo.equals("nopro")){
                int codigoPro = 0;
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(10%)       --> " + iva10);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + (totalPrice-codigoPro));
            
            //-----------------CODIGO mitad------------
            }else if(codigo.equals("mitad")){
                double codigoPro = (totalPrice/2);
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(10%)       --> " + iva10);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + codigoPro);
            
            //-----------------CODIGO meno5------------
            }else if(codigo.equals("meno5")){
                double codigoPro = (totalPrice-5);
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(10%)       --> " + iva10);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + codigoPro);
                
            //-----------------CODIGO 5porc------------
            }else if(codigo.equals("5porc")){
               double codigoPro = (totalPrice-0.05);
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(10%)       --> " + iva10);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + codigoPro);
            }
        }
        
        //------------IVA 4%------------
        if(iva.equals("superReducido")){
            double iva4 = Base*0.04;
            double totalPrice = iva4+ Base;
            
            //-----------------CODIGO nopro------------
            if(codigo.equals("nopro")){
                int codigoPro = 0;
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(4%)       --> " + iva4);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + (totalPrice-codigoPro));
                
            //-----------------CODIGO mitad------------
            }else if(codigo.equals("mitad")){
                double codigoPro = (totalPrice/2);
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(4%)       --> " + iva4);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + codigoPro);
            
            //-----------------CODIGO meno5------------
            }else if(codigo.equals("meno5")){
                double codigoPro = (totalPrice-5);
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(4%)       --> " + iva4);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + codigoPro);
                
            //-----------------CODIGO 5porc------------
            }else if(codigo.equals("5porc")){
               double codigoPro = (totalPrice-0.05);
                System.out.println("Base Imponible --> " + Base);
                System.out.println("Iva(4%)       --> " + iva4);
                System.out.println("Precio con iva --> " + totalPrice);
                System.out.println("Cod prom(noPro)--> " + "-"+codigoPro);
                System.out.println("TOTAL          --> " + codigoPro);
            }
        }
        
    }
}
