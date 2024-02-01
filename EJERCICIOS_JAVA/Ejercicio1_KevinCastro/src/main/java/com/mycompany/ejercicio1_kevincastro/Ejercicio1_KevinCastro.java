/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_kevincastro;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

public class Ejercicio1_KevinCastro 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese sus apellidos: ");
        String apellidos = scanner.nextLine();

        String nombreCompleto = nombre + " " + apellidos;

        System.out.println("Nombre completo: " + nombreCompleto);

        scanner.close();
    }
}

