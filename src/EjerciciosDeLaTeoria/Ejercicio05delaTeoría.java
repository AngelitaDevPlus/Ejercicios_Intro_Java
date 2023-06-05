/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeLaTeoria;

import java.util.Scanner;

/**
 *
 * @author angelita
 */
public class Ejercicio05delaTeoría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresar un valor boleano");
        boolean boleana = read.nextBoolean();
        System.out.println("boleana = " + boleana);
        
        System.out.println("Ingresar un valor double");
        double decimal  = read.nextDouble();
        System.out.println("decimal = " + decimal);
        
        System.out.println("Ingresar un valor char");
        char caracter = read.next().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }
    
}
