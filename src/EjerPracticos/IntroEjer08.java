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
public class IntroEjer08 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un programa que permita introducir solo frases o palabras
     * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo
     * se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en 
     * caso contrario, se deberá imprimir “INCORRECTO”. 
     * Nota: investigar la función Lenght() en Java.
     * 
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresar una frase:");
        String frase = read.nextLine();
        
        if (frase.length() <= 8) {
            System.out.println("CORRECTO");
                                   
        } else {
            System.out.println("INCORRECTO");
        }
 
    }
    
}
