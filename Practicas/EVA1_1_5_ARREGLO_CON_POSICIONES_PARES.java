/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_1_5_arreglo_con_posiciones_pares;

import java.util.Random;

/**
 *
 * @author Swirlix
 */
public class EVA1_1_5_ARREGLO_CON_POSICIONES_PARES {

    public static void main(String[] args) {
       int[] arregloOriginal = new int[15];
        Random rand = new Random();

        // Llenar arreglo original con valores aleatorios
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloOriginal[i] = rand.nextInt(100) + 1;
        }

        // Generar arreglo copia con posiciones pares solo para valores pares
        int[] arregloCopia = new int[15];
        int j = 0; // índice para posiciones pares en arregloCopia
        for (int i = 0; i < arregloOriginal.length; i++) {
            if (i % 2 == 0 && arregloOriginal[i] % 2 == 0) {
                arregloCopia[j] = arregloOriginal[i];
                j++;
            }
        }

        // Imprimir arreglos
        System.out.print("Arreglo original: [");
        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.print(arregloOriginal[i]);
            if (i < arregloOriginal.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Arreglo copia con posiciones pares solo para valores pares: [");
        for (int i = 0; i < arregloCopia.length; i++) {
            System.out.print(arregloCopia[i]);
            if (i < arregloCopia.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}