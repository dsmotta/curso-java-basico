package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //ultilizado para ler entrada de dados do teclado
        /*
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scanner.nextLine(); // faz a leitura de uma linha inteira
        System.out.println("Nome completo é: " + nomeCompleto);

        System.out.println("Digite o primeiro nome:");
        String primeiroNome = scanner.next(); // faz a leitra de qualquer coisa digitada no teclado
        System.out.println("Seu primeiro nome é:" + primeiroNome);

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt(); // faz a leitura de numeros inteiros digitados
        System.out.println("Sua idade é:" + idade);

        System.out.println("Digite a altura:");
        double altura = scanner.nextDouble(); // faz a leitura de numeros decimais
        System.out.println("Sua altura é:" + altura);
        */
        System.out.println("Digite o primeiro nome, idade, quantidade de filhos, altura, e se possui animal estimação:");
        String primeiroNome = scanner.next();
        int idade = scanner.nextInt();
        byte filhos = scanner.nextByte();
        float altura = scanner.nextFloat();
        boolean animal = scanner.hasNextBoolean();
        System.out.println("voce digitou os seguintes dados:");
        System.out.println("Primeiro nome:" + primeiroNome);
        System.out.println("Idade:" + idade);
        System.out.println("Filhos:" + filhos);
        System.out.println("Altura:" + altura);
        System.out.println("Animal:" + animal);



    }
}
