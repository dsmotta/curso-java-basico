package com.loiane.cursojava.aula19Exercicios;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        //Crie vetor com 5 posições inteiros, defina e escreva a soma dos elementos armazenados que
        // são multiplos de 5

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int soma = 0;

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite a posição: " + i);
            vetorA[i] = scan.nextInt();

            if(vetorA[i] % 5 ==0){
                soma += vetorA[i];
            }


        }
        System.out.println("---------------------------------");

        System.out.print("vetor A = ");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");

        }
        System.out.println();
        System.out.println("soma : " + soma);

    }
}
