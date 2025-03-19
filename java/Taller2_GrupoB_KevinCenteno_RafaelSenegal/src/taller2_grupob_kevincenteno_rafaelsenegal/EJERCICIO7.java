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
public class EJERCICIO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        // Leer tres números
        System.out.print("Ingrese el primer numero: ");
        int num1 =leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = leer.nextInt();

    String resultado="";
            
        if (num1 < num2 && num2 < num3) {
            resultado= "incrementando";
        } else if (num1 > num2 && num2 > num3) {
            resultado= "disminuyendo";
        } else {
            resultado= "ni disminuyendo ni aumentando";
        }
        
        System.out.println("Los numeros " + num1 + ", " + num2 + ", " + num3 + " estan " + resultado + ".");
        
        
    }
    
}
