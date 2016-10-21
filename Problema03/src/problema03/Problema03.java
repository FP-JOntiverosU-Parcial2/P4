/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema03;
import java.util.*;

/**
 *
 * @author jaime
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int r;
            r=mostrarResultado();   //resultados y operaciones
           mensajeSalida(); //Salida
   
    
        
       
    }
    public static int solicitarDato(){   //Pide dato
        int dato;
        System.out.println("Introduce el numero:");
        Scanner teclado= new Scanner(System.in);
        dato=teclado.nextInt();
        return dato;
    }
    
    
   public static int mostrarResultado(){
       int dato=solicitarDato(), factorial =1;
       
       
       for (int i=1; i<=dato; i++){   //  
           factorial= factorial*i;
           }
       System.out.println("El resultado de: " + dato + " es: " + factorial);
       return dato;
       }
       
        public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //se agradece
        System.exit(0);//Sale del programa
    }       
     
}

