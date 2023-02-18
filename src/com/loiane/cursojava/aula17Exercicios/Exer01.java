package com.loiane.cursojava.aula17Exercicios;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        //Peça uma nota entre 0 e 10 mostre uma mendagem se o valor for invalido e continue pedindo até
        // informar um valor válido
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Entre com uma nota");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            }else{
                System.out.println("Nota inválida, didite novamente!");
            }
        }while (!notaValida);

        }

    }
