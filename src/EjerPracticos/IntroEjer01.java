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
 */
public class IntroEjer01 {

    /**
     * @param args the command line arguments
     *  Escribir un programa que pida dos números enteros por teclado y 
     * calcule la suma de los dos. 
     * El programa deberá después mostrar el resultado de la suma.
     * 
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresar dos números");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de los números es " + suma);
        
    }
    
}
