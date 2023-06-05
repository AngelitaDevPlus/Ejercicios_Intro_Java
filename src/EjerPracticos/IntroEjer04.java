/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerPracticos;

/**
 *
 * @author @ngelit@
 */
public class IntroEjer04 {

    /**
     * @param args the command line arguments
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente
     * en grados Fahrenheit. 
     * La fórmula correspondiente es: F = 32 + (9 * C / 5).
     * 
     */
    public static void main(String[] args) {
     
        int centigrados = 20;
        
        int fahrenheit = 32 + (9 * centigrados / 5);
        
        System.out.println("La temperatura en fahrenheit es " + fahrenheit);
        
    }
    
}
