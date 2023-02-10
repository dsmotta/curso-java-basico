package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        // Ler 3 numeros e mostrar o maior e o menor
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro numero:");
        int num1 = scan.nextInt();
        System.out.println("Segundo numero:");
        int num2 = scan.nextInt();
        System.out.println("Terceiro numero:");
        int num3 = scan.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Primeiro numero é maior: " + num1);
            if (num2 < num3){
                System.out.println("Segundo numero é menor: " + num2);
            }else {
                System.out.println("Terceiro numero é menor: " + num3);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Segundo numero é maior: " + num2);
            if(num1 < num3){
                System.out.println("Primeiro numero é menor: " + num1);
            }else {
                System.out.println("Terceiro numero é menor: " + num3);
            }
        }else {
            System.out.println("Terceiro numero é maior: " + num3);
            if(num1 < num2){
                System.out.println("Primeiro numero é menor: " + num1);
            }else{
                System.out.println("Segundo numero é menor: " + num2);
            }
        }
    }
}
