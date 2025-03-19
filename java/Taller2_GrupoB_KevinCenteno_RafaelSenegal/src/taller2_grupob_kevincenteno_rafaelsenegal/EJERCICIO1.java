/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2_grupob_kevincenteno_rafaelsenegal;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
         System.out.println("ingrese la masa del objeto en kg: ");
        double masa=leer.nextInt();
         
         System.out.println("ingrese la velocidad del objeto en m/s: ");
         double velocidad=leer.nextInt();
         
         velocidad=Math.pow(velocidad,2);
         
                 
        
         double Ec= (masa*velocidad)/2;
         
         
         
         System.out.println("la energia cinetica del objeto es: "+Ec+ " jules");
         
         
         
         
         
         
         
         
         
    }
    
}
