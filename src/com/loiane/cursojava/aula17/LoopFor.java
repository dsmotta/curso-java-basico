package com.loiane.cursojava.aula17;

public class LoopFor {

    public static void main(String[] args) {
        // comando for a variavel criada para contador somente serve para o bloco for criado
        for(int i=0;i < 5;i++){
            System.out.println(i);
        }
        for (int i=5; i > 0; i--){
            System.out.println(i);
        }
        //Exemplo for com duas variaveis
        for(int i=0, j=10; i < j; i++, j--){
            System.out.println("i = " + i + " j = " + j);
        }
        // Utilizando for com partes ausentes... não comum usar este tipo de for
        // a variavel é criada fora do for
        // posso passar o incremento para dentro do bloco de codigo

        int count = 0;
        for( ; count < 10 ; ){
            System.out.println("valor de count: " + count);
            count += 2;
        }

        //cont com incremento diferente
        for(int cont=0; cont < 10; cont += 2){
            System.out.println("valor de count: " + cont);
        }
        System.out.println("valor count " + count);

        //incremento usando expressão de soma quanto se retira as chaves do for .. somente a primeira linha e executrada
        int soma = 0;
        for(int i=0; i < 5; soma += i++);
        System.out.println("Soma é : " + soma );

    }
}
