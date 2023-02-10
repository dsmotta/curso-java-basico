package com.loiane.cursojava.aula15Exercicios;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        //Ler duas notas de um aluno calcular media e dizer se foi aprovado se a media for maior ou igual a 7
        // reprovado se for menor que 7 e super aprovado  se for igual a 10

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int nota1 = scan.nextInt();
        System.out.println("Digite a segunda nota:");
        int nota2 = scan.nextInt();
        int media = (nota1 + nota2) / 2;

        if(media == 10){
            System.out.println("Super Aprovado, media: " + media );
        } else if (media >= 7) {
            System.out.println("Aprovado, media: " + media);
        }else{
            System.out.println("Reprovado, media: " + media);
        }

    }
}
