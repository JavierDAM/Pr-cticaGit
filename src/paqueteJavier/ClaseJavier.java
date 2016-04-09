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
  
public class ClaseJavier {      
     public static void main(String[] args) {  
           
         int cant, num, pares=0, impares=0;           
         System.out.print("Cuantos numeros desea ingresar: ");  
         Scanner scanner = new Scanner(System.in);  
         cant = scanner.nextInt();  
           
         for(int i=1; i<=cant; i++){  
             System.out.print("Ingresar numero " + i + " de " + cant + ":  ");  
             num =  (new Scanner(System.in)).nextInt();  
             if(num%2 == 0)  
                  pares++;  
             else  
                  impares++;               
         }  
         System.out.println("\nCantidad de numeros pares: " + pares);  
         System.out.println("Cantidad de numeros impares: " + impares);           
     
     System.out.println("Prueba de Git");
     //Multiplicación
     int numero1 =scanner.nextInt();
     int numero2 = scanner.nextInt();
     int multiplicacion = numero1 * numero2;
         System.out.println(multiplicacion);
             }         
}  