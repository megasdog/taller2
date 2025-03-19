/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2_grupob_kevincenteno_rafaelsenegal;

import java.util.Scanner;
import jdk.swing.interop.SwingInterOpUtils;

/**
 *
 * @author kevin
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero: ");
        int n=leer.nextInt();
                
          // Genera los números n, nn y nnn
        
        int n2 = n+n;
        int n3 = n + n + n;

             

        // Imprime los resultados
        System.out.println("n: " + n + " = " +n);
        System.out.println("nn: " + n + n + " = " + n2);
        System.out.println("nn: " + n + n +n + " = " + n3);     
    }
    
}
