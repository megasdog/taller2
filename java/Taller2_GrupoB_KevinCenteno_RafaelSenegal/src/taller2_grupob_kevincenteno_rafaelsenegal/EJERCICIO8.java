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
public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = leer.nextLine();

        // Eliminar espacios y convertir a minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        
        // Comparar el texto original con su inverso
        String textoInvertido = new StringBuilder(texto).reverse().toString();
   
        
        if (texto.equals(textoInvertido)) {
            System.out.println("El texto '" + texto + "' es un palindromo.");
        } else {
            System.out.println("El texto '" + texto + "' no es un palindromo.");
        }
    }

   
        
        
        
    
}
