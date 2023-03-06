/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica1_1_6_suma_matriz;

import java.util.Scanner;

/**
 *
 * @author Swirlix
 */
public class PRACTICA1_1_6_SUMA_MATRIZ {

    public static void main(String[] args) {
          int[][] matriz = new int[4][4];

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        boolean filasIguales = true;
        boolean columnasIguales = true;

        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            if (sumaFila != sumaColumna) {
                filasIguales = false;
                columnasIguales = false;
                break;
            }
        }

        if (filasIguales && columnasIguales) {
            System.out.println("La suma de los valores de cada fila es igual a la suma de los valores de cada columna.");
        } else {
            System.out.println("La suma de los valores de cada fila no es igual a la suma de los valores de cada columna.");
        }
    }
}
    