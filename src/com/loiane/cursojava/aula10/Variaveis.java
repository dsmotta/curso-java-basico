package com.loiane.cursojava.aula10;

public class Variaveis {

    public static void main(String[] args) {
        // declaração variáveis aceito pela convenção java
        int idade = 20;
        String nome = "Douglas";
        String nomeDoMeuCachorro = "Mel";
        String ano2014 = "2014";

        // declaração aceita, mas não utilizado
        int _idade;
        int $idade;

        //não é convensão java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 30; //atribuindo valor para variavel onde a mesma perde o valor que foi inicializada

        //saida de tela mostrando as variaveis
        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

        // má pratica recomenda não ser usado
        int a = 10;
        String b = "Douglas";

    }
}
