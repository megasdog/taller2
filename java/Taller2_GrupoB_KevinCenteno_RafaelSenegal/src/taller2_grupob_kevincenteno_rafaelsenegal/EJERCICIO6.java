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
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese la primer nota: ");
        double nota1=leer.nextInt();
                
        System.out.println("ingrese la segunda nota: ");
        double nota2=leer.nextInt();
                
        System.out.println("ingrese la tercer nota: ");
        double nota3=leer.nextInt();        
        
        System.out.println("ingrese la cuarta nota: ");
        double nota4=leer.nextInt();
                
        System.out.println("ingrese la quinta nota: ");
        double nota5=leer.nextInt();    
        
       //colocando el prcentaje de cada nota 
        nota1=nota1*0.15;
        
        nota2=nota2*0.2;
        
        nota3=nota3*0.15;
        
        nota4=nota4*0.30;
        
        nota5=nota5*0.2;
                
                
       double nota_final=nota1+nota2+nota3+nota4+nota5;
      // defininedo que texto imprimir segun la nota 
       if (nota_final < 2.0) {
            System.out.println("No puede habilitar.");
        } 
       else if (nota_final < 3.0) {
            System.out.println("Reprobo.");
        } 
       else if (nota_final >= 3.0) {
            System.out.println("Aprobo.");
       }
            if (nota_final > 4.5) {
            System.out.println("¡Felicitaciones por su excelente nota!");
       
    }
  
    }
}
