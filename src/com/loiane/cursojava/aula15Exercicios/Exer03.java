package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        // Veriicar se a letra digitada é "F" ou "M" escrever Feminino ou Masculino ou sexo invalido

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite F - Feminino ou M - Masculino:");
        String sexo = scan.next();

        if(sexo.equalsIgnoreCase("f")){ // equalsIgnoreCase ignora se a string digitada e maiuscula ou minuscula
            System.out.println("Sexo Feminino!");
        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("Sexo Masculino!");
        }else {
            System.out.println("Sexo invalido!");
        }

    }
}
