package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {
        //Calculo de folha de pagamento desconto do imposto renda que depende do salario bruto conforme tabela abaixo
        // e 3% para Sindicato o FGTS 11% do salario bruto mas não é descontado salário liquido será o
        // salario bruto menos os descontos. pedir ao trabalhador o valor da hora e quantidade de horas trabalhadas
        // Descontar IR Salário bruto até 900 isento, até 1500 desc 5%, até 2500 desc. 100% acima de 2500 desc 20%
        // mostre na tela as informações
        Scanner scan = new Scanner(System.in);

        System.out.println("######### Demonstrativo Salarial ################");
        System.out.println("Digite qtde de horas:");
        double qtdeHoras = scan.nextDouble();
        System.out.println("Digite o valor da hora:");
        double valorHora = scan.nextDouble();

        double salBruto = valorHora * qtdeHoras;
        double percentualIr = 0;
        double desconto = 0;

        if(salBruto <= 900){
            percentualIr = 0.0;
        } else if (salBruto > 900 && salBruto <= 1500) {
            percentualIr = 5;
        } else if (salBruto > 1500 && salBruto <= 2500) {
            percentualIr = 10;
        }else if (salBruto > 2500) {
            percentualIr = 20;
        }

        double ir = (salBruto / 100) * percentualIr;
        double inss = (salBruto / 100) * 10;
        double fgts = (salBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salLiquido = salBruto - totalDescontos;

        System.out.println("Salario Bruto: (" + valorHora + " * " + qtdeHoras + ")    : R$ " + salBruto) ;
        System.out.println("( - ) IR (" + percentualIr + " %)                : R$ " + ir);
        System.out.println("( - ) INSS (10 %)               : R$ " + inss);
        System.out.println("FGTS (11 %)                     : R$ " + fgts);
        System.out.println("Total de descontos              : R$ " + totalDescontos);
        System.out.println("Salário Liquido                 : R$ " + salLiquido);
        System.out.println("##########################################################");



    }
}
