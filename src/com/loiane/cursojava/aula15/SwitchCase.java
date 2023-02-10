package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        // Exemplo de uso do switch case para evitar if else encadeados desnecessarios
        System.out.println("Digite o dia da Semana: (1 - 7)");
        Scanner scan = new Scanner(System.in);
        int diaSemana = scan.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
            break; //break para a execução quando ele acha o valor passado no swtch
            case 2:
                System.out.println("Segunda");
            break;
            case 3:
                System.out.println("Terça");
            break;
            case 4:
                System.out.println("Quarta");
            break;
            case 5:
                System.out.println("Quinta");
            break;
            case 6:
                System.out.println("Sexta");
            break;
            case 7:
                System.out.println("Sabado");
            break;
            default:
                System.out.println("Dia da semana inválido!!");
        }
        // Neste exemplo observamos o uso do break o codigo testa todas as opçoes até achar a que é igual a
        // passada no switch e para quando achar um break
        // no exemplo se eu digitar 2,3,4,5 ou 6 ele acha o break e imprime "Dia Util !"
        // se eu digitar 1 ou 7 ele para no break e imprime "Fim de semana!"
        // se eu digitar algo diferente de 1,2,3,4,5,6,7 ele para no default e imprime "Dia da semana inválido"
        switch (diaSemana){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util !"); break;
            case 1:
            case 7:
                System.out.println("Fim de semana!"); break;
            default:
                System.out.println("Dia da semana inválido!");
        }



    }
}
