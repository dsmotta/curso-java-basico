package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        // Digitar o turno de estudo M para matutino, V vespertino ou N noturno imprimir tela com turno digitado
        // ou opção inválida
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno de estudo: M (matutino), V (vespertino) ou N (noturno)?");
        String turno = scan.next();

        if(turno.equalsIgnoreCase("m")){
            System.out.println("Turno " + turno + " matutino ");
        } else if (turno.equalsIgnoreCase("v")) {
            System.out.println("Turno " + turno + " vespertino ");
        }else if(turno.equalsIgnoreCase("n")) {
            System.out.println("Turno " + turno + " noturno ");
        }else {
            System.out.println("Opção inválida!");
        }

        switch (turno){
            case "m":
            case "M":
                System.out.println("Periodo matutino");
                break;
            case "v":
            case "V":
                System.out.println("Periodo vespertino");
                break;
            case "n":
            case "N":
                System.out.println("Periodo noturno");
                break;
            default:
            System.out.println("Opção inválida!");
        }

    }

}
