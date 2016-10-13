/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.*;

/**
 *
 * @author jaime
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int r;
            r=mostrarResultado();
           
   
    
        
       
    }
    public static int solicitarDato(){
        int dato;
        System.out.println("Introduce el numero:");
        Scanner teclado= new Scanner(System.in);
        dato=teclado.nextInt();
        return dato;
    }
    
    
   public static int mostrarResultado(){
       int dato=solicitarDato(), factorial =1;
       
       
       for (int i=1; i<=dato; i++){
           factorial= factorial*i;
           }
       System.out.println("El resultado de: " + dato + " es: " + factorial);
       return dato;
       }
       
              
     
}

