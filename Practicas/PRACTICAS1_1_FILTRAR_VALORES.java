/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicas1_1_filtrar_valores;

import java.util.Random;

/**
 *
 * @author Swirlix
 */
public class PRACTICAS1_1_FILTRAR_VALORES {

 
           public static void main(String[] args) {
        int[] arr = new int[15];
        Random rand = new Random();
        int count = 0;
        while (count < 15) {
        int num = rand.nextInt(50) * 2 + 1; // Generar un número impar entre 1 y 100
        if (contains(arr, num)) {


        } else {
        arr[count] = num;
        count++;
      }
        }
        for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

    public static boolean contains(int[] arr, int num) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        return true;
      }
    }
    return false;
  }
}
    


    