/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosCorreccionErrores;

import java.util.Scanner;

/**
 *
 * @author angelita
 */
public class DetecciónDeErrores3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in); 
                   
        System.out.println("Ingresa un número");
        int numero = read.nextInt();
        System.out.println("numero = " + numero);
        
        System.out.println("Ingresa un nombre");
        String nombre = read.next();
        System.out.println("nombre = " + nombre);
        
    }
}
