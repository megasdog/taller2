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
public class EJERCICIO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int contadorPares = 0;
        int contadorCincos = 0;
        int totalNumeros = 0;

        while (contadorPares < 100 && contadorCincos < 80) {
            System.out.print("Ingrese un numero positivo: ");
            int numero =  leer.nextInt();

            if (numero > 0) {
                totalNumeros++;

                if (numero % 2 == 0) {
                    contadorPares++;
                }

                if (numero == 5) {
                    contadorCincos++;
                }
            } else {
                System.out.println("El numero debe ser positivo. Intente de nuevo.");
            }
        }

        System.out.println("Total de numeros leidos: " + totalNumeros);
    }
}
    
    

