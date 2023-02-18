package com.loiane.cursojava.aula19Exercicios;

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

        //Crie vetor com 5 posições inteiros, defina e escreva o percentual de elementos pares
        // e impares dos elementos armazenados

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int impar = 0;
        int par = 0;
        int percentualPar = 0;
        int percentualImpar = 0;

        for(int i=0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição : " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                par++;
            }
            impar = vetorA.length - par;
            //vetorA.length - 100%
            //par           - x
            //x.vetorA.length = par * 100
            //x = par * 100 / vetorA.length
            percentualPar = par * 100 / vetorA.length;
            percentualImpar = 100 - percentualPar;
        }

        System.out.println("----------------------------------------");
        System.out.print("Vetor: ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");

        }
        System.out.println();
        System.out.println("Percentual Pares: " + percentualPar + " %");
        System.out.println("Percentual Impares: " + percentualImpar + " %");

    }
}
