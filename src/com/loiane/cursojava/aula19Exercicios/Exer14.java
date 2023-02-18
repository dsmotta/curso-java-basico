package com.loiane.cursojava.aula19Exercicios;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        //Crie vetor com 5 posições inteiros, defina e escreva a média aritimética simples
        // dos elementos ímpares armazenados

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        double media = 0;
        int soma = 0;
        int cont = 0;


        for(int i=0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição : " + i);
            vetorA[i] = scan.nextInt();

            if(vetorA[i] % 2 != 0){
               soma += vetorA[i];
                cont++;
            }
            media = soma / cont;
        }

        System.out.print("----------------------------------------");
        System.out.print("Vetor: ");
        for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");

        }

        System.out.println("soma: " + soma + " media: " + media);



    }
}
