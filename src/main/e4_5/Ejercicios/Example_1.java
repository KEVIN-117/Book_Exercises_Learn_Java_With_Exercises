/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4_5.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        String dia = input.next();
        if(dia.equals("lunes")){
            System.out.println("|  Dia  |" + "|  Materia        |" + "|    Hora     |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| Lunes |" + "|Algebra (MAT-101)|" + "| 7:45--10:00 |");
        }else if(dia.equals("martes")){
            System.out.println("|  Dia  |" + "|  Materia        |" + "|    Hora     |");
            System.out.println("|-----------------------------------------|");
            System.out.println("|Martes |" + "|Calculo (MAT-300)|" + "| 7:45--10:00 |");
        }else if(dia.equals("miercoles")){
            System.out.println("|     Dia   |" + "|             Materia              |" + "|    Hora     |");
            System.out.println("|--------------------------------------------------------------|");
            System.out.println("| Miercoles |" + "|Tecnicas de programacion (SIS-201)|" + "| 7:45--10:00 |");
        }
        else if(dia.equals("jueves")){
            System.out.println("|   Dia   |" + "|           Materia            |" + "|    Hora     |");
            System.out.println("|--------------------------------------------------------|");
            System.out.println("| Jueves  |" + "|  Computacion Basica (SIS-202)|" + "| 7:45--10:00 |");
        }
        else if(dia.equals("viernes")){
            System.out.println("|   Dia    |" + "|        Materia      |" + "|    Hora     |");
            System.out.println("|------------------------------------------------|");
            System.out.println("| Viernes  |" + "|Estadistica (MAT-300)|" + "| 7:45--10:00 |");
        }
    }
}
