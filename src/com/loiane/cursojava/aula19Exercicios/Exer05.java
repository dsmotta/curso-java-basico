package com.loiane.cursojava.aula19Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {
        //Criar vetor A com 5 elementos inteiros e um vetor B do mesmo tipo e tamanho com os elementos
        // serão os elementos do vetor A multiplicado pela sua posiçao B[i] = A[i] * i
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite posicao: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
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
