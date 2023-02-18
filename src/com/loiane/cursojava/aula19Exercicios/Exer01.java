package com.loiane.cursojava.aula19Exercicios;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
        // Crie dois vetores de cinco posições vetorA e vetorB
        // Faça uma Scanner para digitar os valores e armazene no vetorA
        // Copia os valores do vetorA para o vetorB e suas respectivas posições
        //Imprima os vetores A e B
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length]; //cria o vetor com o mesmo tamanho do vetorA

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posicao: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i]; // vetorB recebe todas as posições e respectivos valores do vertorA

        }
        System.out.println("VetorA = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("VetorB = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
        System.out.println();

    }
}
