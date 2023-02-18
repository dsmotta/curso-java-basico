package com.loiane.cursojava.aula19Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {
        //Criar vetor A com 15 elementos inteiros e um vetor B do mesmo tipo e tamanho com os elementos
        // receberao o valor do vetorA + vetorA
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("VetorA posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.println("VetorA = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("VetorB = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

    }
}
