/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeLaTeoria;

/**
 *
 * @author angelita
 */
public class Ejercicio10delaTeoría {
    
     public static void main(String[] args) {
         
         // Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
         // ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
         // 5 *****
         // 3 ***
         // 11 ***********
         // 2 **
               
         for (int i = 1; i <= 4; i++) {
             
             int randomNumber = (int) (Math.random()*20 + 1);
                         
             int num = Math.round(randomNumber);
             System.out.print(num + "");
                 
             for ( int j = 1; j <= num; j++) {
                System.out.print("*");            
                 }
                System.out.println("");                      
             }
             
         }
                  
     }
    

