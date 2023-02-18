package com.loiane.cursojava.aula19Exercicios;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        //Crie vetor com 5 posições inteiros, defina e escreva a soma dos elementos armazenados neste vetor

        Scanner scan = new Scanner(System.in);

        int[] vetprA = new int[5];
        int soma = 0;

        for (int i=0; i<vetprA.length; i++){
            System.out.println("Digite a posição: " + i);
            vetprA[i] = scan.nextInt();

            soma+=vetprA[i];
        }
        System.out.println("---------------------------------");

        System.out.print("vetor A = ");
        for(int i=0; i<vetprA.length; i++){
            System.out.print(vetprA[i] + " ");

        }
        System.out.println(2);
        System.out.println("soma dos valores : " + soma);
    }
}
