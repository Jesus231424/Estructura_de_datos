/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica1_1_4_buscar_el_primer_elemento_repetido_tres_veces;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Swirlix
 */
public class Practica1_1_4_BUSCAR_EL_PRIMER_ELEMENTO_REPETIDO_TRES_VECES {

    public static void main(String[] args) {
        // Generar un arreglo de tamaño 20 con valores aleatorios entre 1 y 20
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*20) + 1; 
        }
        System.out.println("Arreglo original: " + Arrays.toString(arr));

        // Contar las frecuencias de cada número en el arreglo
        int[] freq = new int[21]; // índice 0 no se utiliza
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        // Buscar el primer número que tenga una frecuencia de 3
        int firstTriple = -1;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 3) {
                firstTriple = i;
                break;
            }
        }

        if (firstTriple == -1) {
            System.out.println("No hay ningún número con un triplicado en el arreglo.");
        } else {
            System.out.println("El primer número que tiene un triplicado es: " + firstTriple);
        }
    }
}