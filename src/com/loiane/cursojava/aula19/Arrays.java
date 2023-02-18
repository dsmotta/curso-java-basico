package com.loiane.cursojava.aula19;

public class Arrays {

    public static void main(String[] args) {

        // Armazenar a temperatura diaria durante um mes - vamos usar o array
        // Array é uma lista ordenada de dados

        double[] temperaturas = new double[30]; //criando um array com 30 posições
        temperaturas[0] = 31.3; //preenchendo as posições do arry começando na posição 0
        temperaturas[1] = 30.1;
        temperaturas[2] = 22.5;
        temperaturas[3] = 15.2;
        temperaturas[4] = 22.8;

        System.out.println("temperatura do dia 3: " + temperaturas[2]); //lembrando que o array começa na posição 0

        System.out.println("O tamanho do array: " + temperaturas.length);

        System.out.println("Valores do array: " + temperaturas); //somente nos aponta endereço de memória

        // Como percorrer um array
        for(int i=0; i<temperaturas.length; i++){ //faz a iteração de um array
            System.out.println("O valor da temperatura do dia " + (i+1) + " é " + temperaturas[i]);
        }

        // Percorrendo com um for melhorado for each
        for (double temp : temperaturas) { // cria uma variavel do mesmo tipo do array e as posições do
                                            // array vão para a variavel
            System.out.println(temp); // impressão de tela da variavel criada no for que contem o array
        }
    }
}
