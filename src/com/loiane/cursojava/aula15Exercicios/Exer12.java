package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        //Leia um numero e exiba o dia correspondente da semana ao digitar outro valor aparecer valor inválido
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia da Semana: ");
        System.out.println("(1-Domingo, 2-Segunda, 3-Terça, 4-Quarta, 5-Quinta, 6-Sexta, 7-Sábado)");
        int num = scan.nextInt();

        switch (num){
            case 1:
                System.out.println("Domingo"); break;
            case 2:
                System.out.println("Segunda"); break;
            case 3:
                System.out.println("Tera"); break;
            case 4:
                System.out.println("Quarta"); break;
            case 5:
                System.out.println("Quinta"); break;
            case 6:
                System.out.println("Sexta"); break;
            case 7:
                System.out.println("Sábado"); break;
            default:
                System.out.println("Numero inválido!");
        }

    }
}
