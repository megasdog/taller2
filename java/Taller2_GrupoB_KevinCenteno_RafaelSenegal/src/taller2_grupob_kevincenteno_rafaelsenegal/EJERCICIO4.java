/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2_grupob_kevincenteno_rafaelsenegal;

import java.util.Scanner;
import javax.sound.midi.SoundbankResource;

/**
 *
 * @author kevin
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         System.out.println("ingrese la cantidad de segundos: ");
         int segundos=leer.nextInt();
                 
         //calculando las horas minutos y segundos restantes      
         int horas=segundos/3600, segundos_res=segundos%3600, minutos=segundos_res/60,segundos_fin=segundos_res%60;
         
         System.out.println("son: "+horas+":"+minutos+":"+segundos_fin);
                 
                 
            
                 
                 
                 
    }
    
}
