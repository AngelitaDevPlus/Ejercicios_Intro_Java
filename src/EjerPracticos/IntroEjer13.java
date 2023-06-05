/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerPracticos;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class IntroEjer13 {

    /**
     * @param args the command line arguments
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
     * lo siguiente: 
        * * * *
        *     *
        *     *
        * * * *
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de elementos del lado:");
        int lado = read.nextInt();
        
        for (int i = 0; i <= lado; i++) {               
            if (i == 0 || i == lado) {
                for (int j = 0; j <= lado; j++) {
                    System.out.print("* ");    
                }
            } else {
                System.out.print("* ");
                for (int j = 1; j < lado; j++) {
                    System.out.print("  ");    
                }  
                System.out.print("*");
            }    
            System.out.println("");
        }
        
    }
    
}
