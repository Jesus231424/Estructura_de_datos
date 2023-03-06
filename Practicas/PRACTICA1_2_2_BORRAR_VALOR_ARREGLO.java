/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica1_2_2_borrar_valor_arreglo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Swirlix
 */
public class PRACTICA1_2_2_BORRAR_VALOR_ARREGLO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[]= new int [15]; 
        int valor = 2; // Valor a eliminar
        int indice = -1; // Índice del valor a eliminar
        int posicionEliminar;
        for (int i = 0; i < 10; i++) {
            System.out.println("ponga numeros [" + i + "]: ");
            arreglo[i] = teclado.nextInt();
        }
        
         System.out.println("\nEl arreglo es: ");
         for (int i = 0; i < 10; i++) {
             System.out.println(arreglo[i] + "en la posicion" + i);
            
        }
            System.out.print("\nDigite la posicion del array a eliminar: ");
            posicionEliminar = teclado.nextInt();
            
           // Buscamos el índice del valor a eliminar
for (int i = 0; i < arreglo.length; i++) {
    if (arreglo[i] == valor) {
        indice = i;
        break;
    }
}

// Si encontramos el valor, lo eliminamos
if (indice != -1) {
    arreglo[indice] = 0; // Cambiamos el valor a cero
    
    // Movemos todos los elementos a partir del índice del valor eliminado una posición a la izquierda
    for (int i = indice + 1; i < arreglo.length; i++) {
        arreglo[i - 1] = arreglo[i];
    }
    
    // Asignamos cero al último elemento del arreglo para evitar duplicar el valor eliminado
    arreglo[arreglo.length - 1] = 0;
}

// Imprimimos el arreglo resultante
System.out.println(Arrays.toString(arreglo)); // [5, 3, 0, 7, 0]
    }
}