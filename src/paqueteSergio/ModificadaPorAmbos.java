/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteJavier;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;  
  
public class ModificadaPorAmbos {      
     public static void main(String[] args) {  
           
         Scanner entrada = new Scanner(System.in);
         String nombre=entrada.nextLine();
         System.out.println("Inserta un nombre:  ");
         
         String apellido=entrada.nextLine();
         System.out.println("Inserta un apellido:  ");
         
         System.out.println(nombre + " " + apellido);
     }         
}  