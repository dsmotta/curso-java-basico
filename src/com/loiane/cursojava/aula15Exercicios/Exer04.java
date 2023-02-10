package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {
        // Veriicar se a letra digitada é vogal ou consoante

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra:");
        String letra = scan.next();

        // Primeira solução
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
            letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
            letra.equalsIgnoreCase("u")){
            System.out.println("Vogal");
        }else {
            System.out.println("Consoante");
        }
        // A partir do java 7 podemos usar o switch com String
        // Segunda solução a mais correta e usada
        if(letra.length() > 1){
            System.out.println("Não é uma letra válida!");
        }else {
            switch (letra){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Vogal"); break;
                default:
                    System.out.println("Consoante");

            }
        }

    }
}
