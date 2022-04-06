/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8_6Ejercicios_Funciones;
import java.util.Scanner;
/**
 * @author krodr
 */
public class mainOfExamplesMatrix {
    private static int row, column, rangeMaximun, rangeMinimun;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int response = 0;
        do {  
            System.out.println();
            System.out.println("::\n1.- Generar matriz n * m\n2.-Fila i-esima de la matriz"
                               + "\n3.-Columna j-esima de la matriz\n4.-Coordenadas en matriz"
                               + "\n5.-Es punto de silla\n6.-Diagonal del matriz\n0.-Salir");
            response = input.nextInt();
            System.out.println("Digite el numero de filas y columnas de la matris");
            row = input.nextInt();
            column = input.nextInt();
            System.out.println("Digite el intervalo minimo y maximo de numeros: ");
            rangeMinimun = input.nextInt();
            rangeMaximun = input.nextInt();
            
            switch (response) {
                case 1:{
                    System.out.println("Generar matriz n * m");
                    GenerateMatrix(row, column, rangeMaximun, rangeMinimun);
                    break;
                }
                case 2:{
                    System.out.println("Fila i-esima de la matriz");
                    System.out.println("Digite la fila que desea visualisar: en este intervalo[0 <" + row + "]");
                    int row_i_esima = input.nextInt();
                    rowIesimaOfMAtrix(row_i_esima, row, column, rangeMinimun, rangeMaximun);
                    break;
                }
                case 3:{
                    System.out.println("j_esima Columna de la matriz");
                    System.out.println("Digite la columna que desea visulizar: en el intervalo [0 <" + column+ "]");
                    int j_esimaColumna = input.nextInt();
                    columJesimaOfMatrix(j_esimaColumna, row, column, rangeMinimun, rangeMaximun);
                    break;
                }
                case 4:{
                    System.out.println("Coordenadas en matriz");
                    System.out.println("Digite el numero que busca: ");
                    int searchNumber = input.nextInt();
                    System.out.println(e8_6Ejercicios_Funciones.Matrices29_34.esCoordenadasEnMatriz.coodenadas(searchNumber, row, column, rangeMinimun, rangeMaximun));
                    break;
                }
                case 5:{
                    System.out.println("Es punto de silla");
                    System.out.println(e8_6Ejercicios_Funciones.Matrices29_34.esPuntoDeSilla.sila(row, column, rangeMinimun, rangeMaximun));
                    break;
                }
                case 6:{
                    System.out.println("Diagonal del matriz");
                    System.out.println("Digite la direccion: \n1.-nose(diagonal del noroeste hacia el sureste)\n2.-neso(diagonal que va del noreste hacia el sureste)");
                    String direction = input.next();
                    if (direction.equals("nose")) {
                        System.out.println("Digite el numero de fila que quieres visualizar: en el intervalo [0 < " + row + "]");
                        int rowSearch = input.nextInt();
                        rowMatriz( row,  column, rowSearch,  rangeMaximun,  rangeMinimun);
                    }else if(direction.equals("neso")){
                        System.out.println("Digite el numero de la columna que quieres visualizar: en el intervalo [0 < " + column + "]");
                        int columSearch = input.nextInt();
                        columMatriz( row,  column, columSearch,  rangeMaximun,  rangeMinimun);
                    }
                    
                    break;
                }
            }
        } while (response != 0);
    }
    private static void GenerateMatrix(int row, int column, int rangeMaximun, int rangeMinimun){
        int[][] matriz = e8_6Ejercicios_Funciones.Matrices29_34.generateMatrizInt.generate(row, column, rangeMinimun, rangeMaximun);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rowIesimaOfMAtrix(int row_i_esima, int row, int column, int rangeMinimun, int rangeMaximun) {
        int[][] matriz = e8_6Ejercicios_Funciones.Matrices29_34.filaMatrizInt.FilaIesima(row_i_esima, row, column, rangeMinimun, rangeMaximun);
        for (int i = row_i_esima; i < 1+row_i_esima; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static void columJesimaOfMatrix(int j_esimaColumna, int row, int column, int rangeMinimun, int rangeMaximun) {
        int[][] matriz = e8_6Ejercicios_Funciones.Matrices29_34.columnaMatizInt.columna(j_esimaColumna, row, column, rangeMinimun, rangeMaximun);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = j_esimaColumna; j < 1+j_esimaColumna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rowMatriz(int row, int column, int rowSearach, int rangeMaximun, int rangeMinimun) {
        int[][] matrix = e8_6Ejercicios_Funciones.Matrices29_34.DiagonalMatriz.diagonal(row, column, rangeMinimun, rangeMaximun, rowSearach );
        System.out.println();
        for (int i = rowSearach; i < 1+rowSearach; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }               
            System.out.println();
        }
    } 

    private static void columMatriz(int row, int column, int columSearch, int rangeMaximun, int rangeMinimun) {
        int[][] matrix = e8_6Ejercicios_Funciones.Matrices29_34.DiagonalMatriz.diagonal(row, column, rangeMinimun, rangeMaximun, columSearch );
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = columSearch; j < 1+columSearch ; j++) {
                System.out.print(matrix[i][j] + " ");
            }               
            System.out.println();
        }
    }
}
