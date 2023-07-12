

package com.mycompany.pruebaparasubirgithub;

import java.util.Scanner;


public class PruebaParaSubirGithub {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dim;
        
        System.out.println("Ingrese la dimension de la matriz");
        dim = leer.nextInt();
        
        int matrizA[][]= new int [dim][dim];
        int matrizB[][]= new int [dim][dim];
        
        llenar_matriz(matrizA,dim);
        llenar_matriz(matrizB,dim);
        
        mostrar_matriz(matrizA,dim);
        mostrar_matriz(matrizB,dim);
        
        sumar_matrix(matrizA,matrizB,dim);
    }
    
    
    public static void  llenar_matriz(int[][] matriz,int dim){
        
        int fila;
        int columna;
        
        for(fila=0;fila<dim;fila++){
            for(columna=0;columna<dim;columna++){
                
                matriz[fila][columna]=(int)(Math.random()*10+1);
        }
        }
        
    }
    
     public static void  mostrar_matriz(int[][] matriz,int dim){
        
        int fila;
        int columna;
        
        for(fila=0;fila<dim;fila++){
            for(columna=0;columna<dim;columna++){
                System.out.print(matriz[fila][columna]+ " ; ");
                
            }
            System.out.println("");    
            System.out.println("");  
  
        }
        
        
    }
    
     public static void sumar_matrix(int[][] a, int[][] b, int dim){
         
       int[][] matrizC = new int [dim][dim];
       int f;
       int c;
         for(f=0;f<dim;f++){
             for(c=0;c<dim;c++){
                 
                 matrizC[f][c]=a[f][c]+b[f][c];
             }
         }
         mostrar_matriz (matrizC,dim);
         
         
     }
    
    
    
    
    
}
