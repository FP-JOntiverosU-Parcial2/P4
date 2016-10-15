/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float r;
        r=operacion(); //introducimos la operacion para despues mostrar el resultado
        
        System.out.println("Gracias por usar el programa");// Agradecemos por usar el programa
    }
    
    public static int solicitarDatos(){ //solicitamos que introduscan el dato al teclado
        int g;
        System.out.println("introduce los grados para convertirlos en Farenheit: ");
        Scanner teclado= new Scanner(System.in);
        g=teclado.nextInt();
        return g;
    }
    public static float operacion(){ //se hace la operacion de conversion
    float f,r, g=solicitarDatos();
    f=(float) 1.8;
    r= (float) ((g*f) + 32);
    System.out.println(g + "°G" + " es igual a: " + r + "°F");//se muestra el resultado
         return g;
    
    }
    
          

}
