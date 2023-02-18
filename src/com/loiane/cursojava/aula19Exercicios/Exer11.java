package com.loiane.cursojava.aula19Exercicios;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        //Crie vetor com 5 posições inteiros, defina e escreva a quantidade de elementos armazenados que são pares

        Scanner scan = new Scanner(System.in);

        int[] vertorA = new int[5];
        int qtdPares = 0;

        for(int i=0; i<vertorA.length; i++){
            System.out.println("Digite as posições: " + i);
            vertorA[i] = scan.nextInt();

            if(vertorA[i] % 2 == 0){
                qtdPares++;
            }

        }
        System.out.println("-----------------------------------------");
        System.out.println("Qtde pares: " + qtdPares);
    }
}
