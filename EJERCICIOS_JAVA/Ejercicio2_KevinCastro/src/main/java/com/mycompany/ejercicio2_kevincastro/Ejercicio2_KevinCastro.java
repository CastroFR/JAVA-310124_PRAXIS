/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_kevincastro;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

public class Ejercicio2_KevinCastro 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        double suma = numero1 + numero2 + numero3;
        double resta = numero1 - numero2 - numero3;
        double multiplicacion = numero1 * numero2 * numero3;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        scanner.close();
    }
}
