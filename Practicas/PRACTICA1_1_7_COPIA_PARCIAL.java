/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica1_1_7_copia_parcial;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Swirlix
 */
public class PRACTICA1_1_7_COPIA_PARCIAL {

    public static void main(String[] args) {
        int iVal;
        int iVal2;
        Scanner input = new Scanner(System.in);
        int[] iArreglo = new int[15];
        for (int i = 0; i < iArreglo.length; i++) {
            Random r = new Random();
            iArreglo[i] = r.nextInt(20) + 1;  // Entre 0 y 5, más 1
            System.out.print(iArreglo[i] + ",");
        }
        System.out.println("");
        System.out.println("Copiar solo pares");
        System.out.println("Posicion 1 a copiar");
        iVal = input.nextInt();
        System.out.println("Posicion 2 a copiar");
        iVal2 = input.nextInt();
        int[] icopia = new int[iVal2];
        int b = 0;
        for (int i = iVal - 1; i < iVal2; i++) {
            icopia[b] = iArreglo[i];
            if (icopia[b] % 2 == 0) {
                System.out.print(icopia[b] + ",");
            } else {

            }
            b++;
        }
        System.out.println("");
    }

}