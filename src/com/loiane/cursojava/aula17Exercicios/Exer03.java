package com.loiane.cursojava.aula17Exercicios;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        // ler as seguintes informações Nome: maior que 3 caracteres
        // idade: entre 0 e 150; salário maior que zero; sexo 'f' ou 'm'; estado civil 's', 'c', 'v', 'd'

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do{
            System.out.println("Entre com o nome: ");
            nome = scan.next();
            if(nome.length() >= 3){
                infoValida = true;
            }else {
                System.out.println("Nome precisa de no mínimo 3 caracteres!");
            }
        }while (!infoValida);

        infoValida = false; //posso ultilizar essa variavel... não será alterado os blocos de execução

        do{
            System.out.println("Entre com a idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150){
                infoValida = true;
            }else {
                System.out.println("A idade deve ser maior que 0 e menor que 150!");
            }
        }while (!infoValida);

        infoValida = false;
        do{
            System.out.println("Entre com o salário: ");
            salario = scan.nextDouble();

            if (salario > 0){
                infoValida = true;
            }else {
                System.out.println("Salário tem que ser maior que 0,00");
            }
        }while (!infoValida);

        infoValida = false;
        do{
            System.out.println("Entre com o sexo ('M' ou 'F'): ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
                infoValida = true;
            }else {
                System.out.println("Sexo invalido: Digite 'M' Masculino ou 'F' Feminino!" );
            }
        }while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite 'C' casado, 'S' solteiro, 'V' viuvo ou 'D' divorciado: ");
            estadoCivil = scan.next();
            switch (estadoCivil){
                case "c":
                case "C":
                    infoValida = true;
                    System.out.println("casado"); break;
                case"s":
                case "S":
                    infoValida = true;
                    System.out.println("solteiro"); break;
                case"v":
                case "V":
                    infoValida = true;
                    System.out.println("viuvo"); break;
                case"d":
                case "D":
                    infoValida = true;
                    System.out.println("divorciado"); break;
                default:
                    System.out.println("Estado civil inválido!");
            }
        }while (!infoValida);
    }
}
