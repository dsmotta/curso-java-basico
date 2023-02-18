package com.loiane.cursojava.aula19Exercicios;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        //Criar vetor A com 8 elementos inteiros e um vetor B do mesmo tipo e tamanho com os elementos
        // do vetor A multiplicados por 2

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length]; //cria o vetor com o mesmo tamanho do vetorA

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posicao: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * 2; // vetorB recebe todas as posições e respectivos valores do vertorA

        }
        System.out.print("VetorA = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("VetorB = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
        System.out.println();



    }
}
