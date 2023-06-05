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
public class Ejercicio09delaTeoría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num;
        int contador = 0;
        int suma = 0;
        
        do {
        
        System.out.println("Ingrese un número");
        num = read.nextInt();
        
            contador = contador + 1;
           // System.out.println("contador = " + contador);
        
        if (num > 0) {
            
            suma = suma + num;
           // System.out.println("suma = " + suma);
        }
        
        } while (num != 0 && contador <= 5);
        
        if ( num == 0) {
            
            System.out.println("Se capturó el cero");
        
        } else {
            
            System.out.println("Se ingresó el maximo de números");
        
    }
        
    }
    
}
