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
public class Ejercicio13_14delaTeoría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        String[] equipo = new String[2];
        
        for (int i = 0; i < equipo.length; i++) {
            
            System.out.println("Ingresar el nombre de un integrante del equipo");
            equipo[i] = read.nextLine();
            
        }
        
        for (int i = 0; i < equipo.length; i++) {
            
            System.out.print("[" + equipo[i] + "]");
            
        }
        System.out.println("");
    }
    
}
