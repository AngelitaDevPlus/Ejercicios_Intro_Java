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
public class Ejercicio08delaTeoría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresar una nota entre 0 y 10");
        int nota = read.nextInt();
        
        while (nota < 0 || nota > 10) {
            
            System.out.println("La nota no es válida, ingresar nuevamente");
            nota = read.nextInt();
            
        } 
        
        System.out.println("La nota es válida");
    }
    
}
