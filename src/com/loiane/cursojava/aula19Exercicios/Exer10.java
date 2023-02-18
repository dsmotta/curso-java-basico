package com.loiane.cursojava.aula19Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        //Criar dois vetores A e B com 5 elementos inteiros, um vetor C onde cada elemento de C
        // é a divisão dos elementos do vetor A e B
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorB.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Vetor A posição: " + i);
            vetorA[i] = scan.nextInt();
        }
        System.out.println("-------------------------------------------------------------");
        for(int i=0; i<vetorB.length; i++){
            System.out.println("Vetor B posição: " + i);
            vetorB[i] = scan.nextInt();

            vetorC[i] = vetorA[i] / vetorB[i];
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

        System.out.print("VetorC = ");
        DecimalFormat df = new DecimalFormat("###,###.##");
        for (int i=0; i<vetorC.length; i++){
            System.out.print(df.format(vetorC[i]) + " ");
        }

    }
}
