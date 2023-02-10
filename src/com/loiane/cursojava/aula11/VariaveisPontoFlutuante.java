package com.loiane.cursojava.aula11;

import java.util.Scanner;

public class VariaveisPontoFlutuante {

    public static void main(String[] args) {

        //Variaves Ponto Flutuante são as que possuem casas decimais

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do notebook:");
        double valorNotebook = scan.nextDouble();
        System.out.println(valorNotebook);

        double valorPassagem = 2.90; //tipo double é o mais usado em projetos 64 bits
        float valorTomate = 3.95f; // tipo float não é muito usado em projetos 32 bits

        System.out.println("valor Passagem = " + valorPassagem);
        System.out.println("valor Tomate = " + valorTomate
        );


    }
}
