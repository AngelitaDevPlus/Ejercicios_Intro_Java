/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerPracticos;

import java.util.Scanner;

/**
 *
 * @author @ngelita@
 */
public class IntroEjer05 {

    /**
     * @param args the command line arguments
     * 
     * Escribir un programa que lea un número entero por teclado y muestre
     * por pantalla el doble, el triple y la raíz cuadrada de ese número. 
     * Nota: investigar la función Math.sqrt().
     * 
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresar un número entero:");
        
        int num = read.nextInt();
        
        System.out.println("El doble es " + 2*num);
        System.out.println("El triple es " + 3*num);
        System.out.println("La raiz cuadrada es " + Math.sqrt(num));
        
    }
    
}
