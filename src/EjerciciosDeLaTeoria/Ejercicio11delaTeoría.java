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
public class Ejercicio11delaTeoría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String fraseInicial = scan.nextLine();
        
                    
        System.out.println(codificar(fraseInicial));
        
    }    
    
    public static String codificar (String fraseInicial) {
        
        String codificado = "";
        
        int length = fraseInicial.length();
        
        for (int i = 0; i <= (length - 1); i++) {

            String letra = fraseInicial.charAt(i) + "";
     
         
            switch (letra.toLowerCase()) {

                case "a": 
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;

            }
            codificado = codificado.concat(letra);
        }
        
        return codificado;
    }   
    
}
