package com.loiane.cursojava.aula19Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        //Criar vetor A com 15 elementos inteiros e um vetor B do mesmo tipo e tamanho com os elementos
        // raiz quadrada do vetor A
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[4];
        double[] vetorB = new double[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("VetorA posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.println("VetorA = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.println("VetorB = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(df.format(vetorB[i]) + " ");
        }
        System.out.println();

    }
}
