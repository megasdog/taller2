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
public class EJERCICIO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer numero (n): ");
        int n = leer.nextInt();

        System.out.print("Ingrese el segundo numero (m): ");
        int m = leer.nextInt();

        if (m > n) {
            int suma = 0;
            for (int i = n + 1; i < m; i++) {
            suma += i;
            }
            System.out.println("La suma de los numeros naturales entre " + n + " y " + m + " es: " + suma);
        } else {
            System.out.println("Error: m debe ser mayor que n.");
        }
    }

    
    }
    

