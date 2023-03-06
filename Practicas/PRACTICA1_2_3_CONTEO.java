/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica1_2_3_conteo;

import java.util.Arrays;

/**
 *
 * @author Swirlix
 */
public class PRACTICA1_2_3_CONTEO {

    public static void main(String[] args) {
         int[] arreglo = new int[15];
    for (int i = 0; i < arreglo.length; i++) {
      arreglo[i] = (int) (Math.random() * 100) + 1;
    }
    System.out.println("Arreglo: " + Arrays.toString(arreglo));

    // Generar la matriz con los elementos diferentes del arreglo
    int[][] matriz = new int[numElementosDiferentes(arreglo)][2];
    int filaActual = 0;
    for (int i = 0; i < arreglo.length; i++) {
      // Verificar si el elemento ya ha sido agregado a la matriz
      boolean existe = false;
      for (int j = 0; j < filaActual; j++) {
        if (arreglo[i] == matriz[j][0]) {
          existe = true;
          matriz[j][1]++;
          break;
        }
      }
      // Si el elemento no ha sido agregado, agregarlo como nueva fila
      if (!existe) {
        matriz[filaActual][0] = arreglo[i];
        matriz[filaActual][1] = 1;
        filaActual++;
      }
    }

    // Imprimir la matriz
    System.out.println("Matriz:");
    for (int i = 0; i < matriz.length; i++) {
      System.out.println(Arrays.toString(matriz[i]));
    }
  }

  // Método para contar el número de elementos diferentes en un arreglo
  public static int numElementosDiferentes(int[] arreglo) {
    int numDiferentes = 0;
    for (int i = 0; i < arreglo.length; i++) {
      boolean existe = false;
      for (int j = 0; j < i; j++) {
        if (arreglo[i] == arreglo[j]) {
          existe = true;
          break;
        }
      }
      if (!existe) {
        numDiferentes++;
      }
    }
    return numDiferentes;
  }
}