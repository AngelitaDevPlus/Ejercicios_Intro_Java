/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeLaTeoria;

import java.util.Scanner;

/**
 *
 * @author @ngelit@ 
 */
public class Ejercicio12delaTeoría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresar dos números que sean multiplos");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
                
        esMultiplo (num1,num2);
    }
    
    public static void esMultiplo (int num1, int num2) {
    
        if (num1 % num2 == 0) {
            
            System.out.println("El primer número ingresado es múltiplo del segundo.");
                        
        } else {
            
            System.out.println("Los números no son múltiplos.");
        }
        
    }
        
}
