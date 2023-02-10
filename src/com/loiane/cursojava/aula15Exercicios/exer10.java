package com.loiane.cursojava.aula15Exercicios;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class exer10 {

    public static void main(String[] args) {

        // Receber o salario do colaborador e o reajuste seguindo o criterio: até 280,00 20% entre 280,00
        // e 700,00 15% entre 700,00 e 1500,00 10% de 1500,00 em diante 5% após o aumento informe na tela
        // salario antes do reajuste, percentual aplicado, valor do aumento e o salario atualizado
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário atual:");
        double salAtual = scan.nextDouble();
        double salAtualixzado;
        double aumento;
        double percentual = 0;

        if(salAtual <= 280){
            percentual = 20;
        } else if (salAtual > 280 && salAtual < 700) {
            percentual = 15;
        }else if (salAtual >= 700 && salAtual < 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        aumento = (salAtual / 100) * percentual;
        salAtualixzado = salAtual + aumento;

        System.out.println("************ DEMONSTRATIVO REAJUSTE SALARIAL **************");
        System.out.println("Salario atual: " + salAtual);
        System.out.println("Percentual: " + percentual);
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Salario atualizado: " + salAtualixzado);
        System.out.println("----------------//-----------//-------------//----------------//");

    }
}
