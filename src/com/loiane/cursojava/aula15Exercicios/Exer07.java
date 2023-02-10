package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        // Informe o preço de tres produtos e informe qual produto devo comprar optando pelo mais barato
        Scanner scan = new Scanner(System.in);

        System.out.println("Preço 1:");
        double preco1 = scan.nextDouble();
        System.out.println("Preço 2:");
        double preco2 = scan.nextDouble();
        System.out.println("Preço 3:");
        double preco3 = scan.nextDouble();

        if(preco1 <= preco2 && preco1 <= preco3){
            System.out.println("Compre o produto 1!");
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.println("Compre o produto 2!");
        }else {
            System.out.println("Compre o produto 3!");
        }

    }
}
