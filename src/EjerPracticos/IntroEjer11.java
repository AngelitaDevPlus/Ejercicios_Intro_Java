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
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:
 * 
 *      MENU
 *      1. Sumar
 *      2. Restar
 *      3. Multiplicar
 *      4. Dividir
 *      5. Salir
 *      Elija opción:
 * 
 * El usuario deberá elegir una opción y el programa deberá mostrar el 
 * resultado por pantalla y luego volver al menú. El programa deberá ejecutarse
 * hasta que se elija la opción 5. 
 * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
 * del programa directamente, se debe mostrar el siguiente mensaje de 
 * confirmación: ¿Está seguro que desea salir del programa (S/N)? 
 * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
 * contrario se vuelve a mostrar el menú.
 * 
 */
public class IntroEjer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        boolean menu = true;
        System.out.println("Ingrese dos números enteros positivos:");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
                      
        while (menu) {
            
            System.out.println("=============MENU=============");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            
            int opcion = read.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los números es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los números es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los números es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division de los números es " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir (S/N)?");
                    read.nextLine();
                    String respuesta = read.nextLine();
                    String respuestaMayuscula = respuesta.toUpperCase();
                        if ("S".equals(respuestaMayuscula)) {
                            System.out.println("Usted ha salido del programa");
                            menu = false;                           
                        } 
                    break;
                default:
                    System.out.println("Opción no válida");;
            }
            
        }
        
    }
    
}
