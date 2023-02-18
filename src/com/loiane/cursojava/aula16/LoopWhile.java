package com.loiane.cursojava.aula16;

public class LoopWhile {

    public static void main(String[] args) {

        // Exemplo usando laço de repetição Whilw temos que criar a variavel cotador no caso o i
        // Testa a condição sendo verdadeira imcrementa e executa o codigo se for falsa sai fora do laço

        int i = 1; // cont ou count
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max){
            System.out.println("Valor de i: " + i);
            i++; // poderia ser tambem i = i+1; ou i+=1
        }

        System.out.println(i); // sai do loop porem a variavel ja incrementou so não mostrará na tela

        //Exemplo laçõ de repetição do while
        // primeiro executa o bloco de codigo e depois testa a condição
        do{
            i++;
            System.out.println("valor de i: " + i);
        }while (i < 15);

        System.out.println(i);

    }
}
