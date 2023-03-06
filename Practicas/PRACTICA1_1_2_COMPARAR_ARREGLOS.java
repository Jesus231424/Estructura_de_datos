/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica1_1_2_comparar_arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Swirlix
 */
public class PRACTICA1_1_2_COMPARAR_ARREGLOS {

    public static void main(String[] args) {
 // Crear dos arreglos de tamaño 10
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];

        Scanner sc = new Scanner(System.in);

        // Solicitar valores desde el teclado para llenar ambos arreglos
        System.out.println("Ingrese valores para el arreglo 1:");
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = sc.nextInt();
        }

        System.out.println("Ingrese valores para el arreglo 2:");
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = sc.nextInt();
        }

        // Imprimir ambos arreglos
        System.out.println("Arreglo 1: " + Arrays.toString(arreglo1));
        System.out.println("Arreglo 2: " + Arrays.toString(arreglo2));

        // Indicar si los arreglos SON IGUALES
        boolean iguales = true;
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] != arreglo2[i]) {
                iguales = false;
                break;
            }
        }

        if (iguales) {
            System.out.println("Ambos arreglos son iguales");
        } else {
            System.out.println("Los arreglos no son iguales");
        }
    }
}