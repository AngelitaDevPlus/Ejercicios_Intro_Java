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
public class IntroEjer10 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite positivo, y
     * a continuación solicite números al usuario hasta que la suma de los 
     * números introducidos supere el límite inicial. 
     * 
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresar un valor límite positivo:");
        int valorLimite = read.nextInt();
        
        int suma = 0;
                
        while (suma < valorLimite) {

            System.out.println("Ingresar un número menor que el límite:");
            int num = read.nextInt();
            
            suma = suma + num;
            System.out.println(suma);
        }
        
        System.out.println("La sumatoria de los número ha alcanzado el valor límite.");    
    }
    
}
