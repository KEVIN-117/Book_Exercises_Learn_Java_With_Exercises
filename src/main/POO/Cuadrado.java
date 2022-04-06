/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author krodr
 */
public class Cuadrado {
    int lado;
    public Cuadrado(int l) {
        this.lado = l;
    }
    public String toString() {
        int i, espacios;
        String resultado = "";
        for (i = 0; i < this.lado; i++) {
            resultado += "OO";
        }
        resultado += "\n";
        for (i = 1; i < this.lado - 1; i++) {
            resultado += "OO";
            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += " ";
            }
            resultado += "OO\n";
        }
        for (i = 0; i < this.lado; i++) {
            resultado += "OO";
        }
        resultado += "\n";
        return resultado;
    }
    
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println(cuadrado);
    }
}
