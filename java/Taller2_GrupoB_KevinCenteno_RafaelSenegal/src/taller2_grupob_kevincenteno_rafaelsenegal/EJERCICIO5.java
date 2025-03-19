package taller2_grupob_kevincenteno_rafaelsenegal;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kevin
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         String parimpar="",tipo="";
                 
        
        System.out.println("ingrese un numero: ");
        int n=leer.nextInt();
        
        
        
        if (n%2 == 0){
            
            parimpar="par";
            
        }
        else{
            parimpar="impar";
            
        }
            
            
         if (n>=0){
             tipo="positivo";
             
         }   
         else{
             tipo="negativo";
         }
                
        System.out.println("el numero es "+parimpar+" y "+tipo);
        
        
        
    }
    
}
