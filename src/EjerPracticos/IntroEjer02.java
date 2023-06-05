/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerPracticos;

import java.util.Scanner;

/**
 *
 * @author @ngelit@
 * Escribir un programa que pida tu nombre, lo guarde en una variable y
 * lo muestre por pantalla.
 * 
 * 
 */
public class IntroEjer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
     
        System.out.println("Ingresar tu nombre");
        String nombre = read.nextLine();
        
        System.out.println(nombre);
        
    }
    
}
