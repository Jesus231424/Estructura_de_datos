/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica1_3_1_juego_del_ahorcado;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Swirlix
 */
public class PRACTICA1_3_1_JUEGO_DEL_AHORCADO {

    public static void main(String[] args) {
        int vidas;
        Scanner input = new Scanner(System.in);
        String[] iPalabras = new String[5];
        iPalabras[0] = "manzana";
        iPalabras[1] = "avion";
        iPalabras[2] = "ferrari";
        iPalabras[3] = "computadora";
        iPalabras[4] = "pinguino";
        Collections.shuffle(Arrays.asList(iPalabras));
        for (int i = 0; i < iPalabras.length; i++) {
            char[] caracteres;
            caracteres = new char[iPalabras[i].length()];
            boolean[] letraExiste = new boolean[iPalabras[i].length()];
            for (int j = 0; j < iPalabras[i].length(); j++) {
                caracteres[j] = iPalabras[i].charAt(j);
            }
            for (int j = 0; j < iPalabras[i].length(); j++) {
                letraExiste[j] = false;
            }
            vidas = 4;
            do {
                for (int j = 0; j < iPalabras[i].length(); j++) {
                    if (letraExiste[j] == true) {
                        System.out.print("[" + caracteres[j] + "]");
                    } else {
                        System.out.print("[ ]");
                    }
                }
                System.out.println();
                System.out.println("Sabe la respuesta?\nSi o No ");
                String iVal = input.nextLine();
                iVal = iVal.toLowerCase();
                if (iVal.equals("si")) {
                    System.out.println("Cual es la respuesta?");
                    String respuesta = input.nextLine();
                    respuesta = respuesta.toLowerCase();
                    if (respuesta.equals(iPalabras[i])) {
                        System.out.println("Ganaste");
                        for (int j = 0; j < iPalabras[i].length(); j++) {
                            System.out.print("[" + caracteres[j] + "]");
                            System.out.print("");
                        }
                        vidas = -1;
                    } else {
                        System.out.println("pierdes, respuesta correcta");
                        for (int j = 0; j < iPalabras[i].length(); j++) {
                            System.out.print("[" + caracteres[j] + "]");
                        }
                        vidas =-1;
                    }
                } else if (iVal.equals("no")) {
                    int a = 0;
                    System.out.println("Insertar letra");
                    char letra = input.next().charAt(0);
                    for (int j = 0; j < iPalabras[i].length(); j++) {
                        if (caracteres[j] == letra) {
                            letraExiste[j] = true;
                            a++;
                        }
                    }
                    if (a == 0) {
                        System.out.println("No esta su letra. -1 vida");
                        vidas = vidas - 1;
                    } else {
                        System.out.println("la letra " + letra + " esta en las siguientes casillas");
                    }
                } else if (iVal.equals("no") && iVal.equals("si")) {
                    System.out.println("Inserte la palabra");
                }System.out.println("");
                System.out.println("Presione enter para continuar");
                input.nextLine();
                if (vidas == -1) {
                    System.out.println("");
                }
                if (vidas == 0) {
                    System.out.println("Perdio");
                    System.out.println("respuesta correcta");
                    for (int j = 0; j < iPalabras[i].length(); j++) {
                        System.out.print("[" + caracteres[j] + "]");
                    }
                }
            } while (vidas > 0);
            System.out.println("¿Desea jugar de nuevo?");
            String iVal2 = input.nextLine();
            iVal2 = iVal2.toLowerCase();
            if (iVal2.equals("si")) {

                System.out.println("");
            } else if (iVal2.equals("no")) {
                System.out.println("Gracias por jugar");
                System.exit(0);
            } else {
                System.out.println("Inserte la palabra");
            }
        }
        System.out.println("El juego termino!");
    }
}
          
    

