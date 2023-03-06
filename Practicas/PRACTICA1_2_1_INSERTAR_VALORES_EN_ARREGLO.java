/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica1_2_1_insertar_valores_en_arreglo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Swirlix
 */
public class PRACTICA1_2_1_INSERTAR_VALORES_EN_ARREGLO {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int iArreglo[] = new int[15];

        
        for (int i = iArreglo.length; i > 0; i--) {
            System.out.println("Insertar numeros: ");
            iArreglo[i - 1] = entrada.nextInt();
            for (int j = 0; j < iArreglo.length; j++) {
                Arrays.sort(iArreglo);
                System.out.print("[" + iArreglo[j] + "]");
            }
            System.out.println("");
        }
        Arrays.sort(iArreglo);
        System.out.println("El arreglo seria: ");
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.print("[" + iArreglo[i] + "]");
        }
    }

}
    