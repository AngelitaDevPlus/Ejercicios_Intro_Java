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
public class Ejercicio06delaTeoría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresar un número entero");
        int num1 = read.nextInt();
        
        System.out.println("Ingresar otro número entero");
        int num2 = read.nextInt();
        
        if ((num1 > 25) && (num2 > 25)) { System.out.println("Ambos números son mayores que 25");
        } else if ((num1 > 25) || (num2 > 25)) { System.out.println("Uno de los números es mayor que 25");
        } else { System.out.println("Ninguno es mayor que 25");
        }
    }
    
}
