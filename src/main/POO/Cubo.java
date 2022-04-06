/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author krodr
 */
public class Cubo {
    private int capacidad;
    private int contenido;

    public Cubo(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int litros) {
        this.contenido = litros;
    }
    void vacia(){
        this.contenido = 0;
    }
    void llena(){
        this.contenido = this.capacidad;
    }
    void pinta(){
        for (int i = this.capacidad; i > 0; i--) {
            if (this.contenido >= i) {
                System.out.println("|********|");
            }else{
                System.out.println("|        |");
            }
            
        }
        System.out.println("----------");
    }
    void vuelcaEn(Cubo destino){
        int libres  = destino.getCapacidad() - destino.getContenido();
        if(libres > 0){
            if (this.contenido <= libres) {
                destino. setContenido(destino.getContenido() + this.contenido);
                this.vacia();
            }else{
                this.contenido -= libres;
                destino.llena();
            }
        }
    }
    public static void main(String[] args) {
        Cubo cubito = new Cubo(6);
        Cubo cubote = new Cubo(10);
        
        System.out.println("Cubito : \n");
        cubito.llena();
        cubito.pinta();
        System.out.println("\nCubote : \n");
        cubote.llena();
        cubote.pinta();
        System.out.println("\nBuelco el cubito en el cubote\n");
        cubote.pinta();
        cubito.vuelcaEn(cubote);
        System.out.println("\nBuelco el cubote en el cubito\n");
        cubito.pinta();
        cubote.vuelcaEn(cubito);
        
        System.out.println("Cubito : \n");
        cubito.pinta();
        System.out.println("\nCubote : \n");
        cubote.pinta();
    }
}
