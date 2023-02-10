package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        // Pedir um valor e mostrar na tela se é positivo ou negativo

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scan.nextInt();

        if (num >= 0){
            System.out.println("Numero positivo!");
        }else {
            System.out.println("Numero negativo!");
        }

    }
}
