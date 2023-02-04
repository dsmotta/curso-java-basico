package com.loiane.cursojava.aula11;

public class VariaveisInteiras {

    public static void main(String[] args) {

        //Declaracao de variáveis do tipo inteiro

        byte idade01 = 20; //não é muito usado temanho 8 bits
        short idade02 = 21; // não é muito usado tamanho 16 bits
        int idade03 = 22; // muito usada em projgetos tamanho 32 bits
        long idade04 = 23; // muito usada em projetos tamanho 64 bits

        System.out.println("Valor vairável idade01 = " + idade01 );
        System.out.println("Valor vairável idade02 = " + idade02 );
        System.out.println("Valor vairável idade03 = " + idade03 );
        System.out.println("Valor vairável idade04 = " + idade04 );

        //###### CURIOSIDADES SOBRE AS VARIAVEIS INTEIRAS ######

        int var1 = 2147483647; //limite maximo de uma variavel inteira se mudarmos o ultimo 7 para 8
                               // ja apresenta erro
        int var2 = 1;

        System.out.println(var1 + var2); // proximo valor quando é excedido o limite
                                         // será o menor valor conforme saida abaixo
        // -2147483648 esta será a saida da soma

        // ou seja o momento que eu pego o limite e somo algo voltara para o valor minimo ou seja negativo
        //isso pois os numeros no java funcionam como uma roleta

    }
}
