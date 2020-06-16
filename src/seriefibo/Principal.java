/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibo;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int n,f=0;
        int siguiente=1;
        int anterior;
        System.out.println("¿cuantos numeros desea generar?");
        n=leer.nextInt();
        for (int i = 0; i <= n; i++) {
            anterior=f;
            f=siguiente+f;
            siguiente=anterior;
            System.out.print(" "+siguiente);
            
        }
        
    }
    
}
