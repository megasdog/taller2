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
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

  
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa la coordenada X del primer punto (x1): ");
        double x1 = leer.nextDouble();

        System.out.print("Ingresa la coordenada Y del primer punto (y1): ");
        double y1 = leer.nextDouble();

        System.out.print("Ingresa la coordenada X del segundo punto (x2): ");
        double x2 = leer.nextDouble();

        System.out.print("Ingresa la coordenada Y del segundo punto (y2): ");
        double y2 = leer.nextDouble();

        // Calcula la distancia utilizando la fórmula de la distancia euclidiana
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}
