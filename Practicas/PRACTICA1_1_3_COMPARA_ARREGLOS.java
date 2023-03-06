/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica1_1_3_compara_arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Swirlix
 */
public class PRACTICA1_1_3_COMPARA_ARREGLOS {

    public static void main(String[] args) {
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los valores del primer arreglo:");
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = input.nextInt();
        }

        System.out.println("Ingrese los valores del segundo arreglo:");
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = input.nextInt();
        }

        System.out.println("El primer arreglo es: " + Arrays.toString(arreglo1));
        System.out.println("El segundo arreglo es: " + Arrays.toString(arreglo2));

        if (sonSimilares(arreglo1, arreglo2)) {
            System.out.println("Ambos arreglos son similares.");
        } else {
            System.out.println("Los arreglos no son similares.");
        }
    }

    public static boolean sonSimilares(int[] arreglo1, int[] arreglo2) {
        if (arreglo1.length != arreglo2.length) {
            return false;
        }

        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);

        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] != arreglo2[i]) {
                return false;
            }
        }

        return true;
    }
}
    

