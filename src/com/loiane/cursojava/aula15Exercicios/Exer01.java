package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public interface Exer01 {

    public static void main(String[] args) {
        // Ler dois numeros e imprimir o maior deles

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite num1:");
        int num1 = scan.nextInt();
        System.out.println("Digite num2");
        int num2 = scan.nextInt();

        if(num1 > num2 ){
            System.out.println("num1 é maior! " + num1);
        }else if (num1 < num2){
            System.out.println("num2 é maior! " + num2);
        }else {
            System.out.println("Numeros iguais: " + num1 + "-" + num2);
        }


    }
}
