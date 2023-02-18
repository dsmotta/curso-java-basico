package com.loiane.cursojava.aula19Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        //Criar dois vetores A e B com 5 elementos inteiros, o vetor B onde cada elemento
        // será o resto da divisão do respectivo elemento de A por dois
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Vetor A posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] % 2; //MOD - resto da divisão
        }

        System.out.println("-------------------------------------------------------------");

        System.out.print("VetorA = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("VetorB = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();


    }
}
