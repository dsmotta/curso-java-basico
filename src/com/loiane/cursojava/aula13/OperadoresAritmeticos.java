package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //Exemplo de operações
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7; // Operador MOD onde retorna o resto da divisão
        System.out.println(resultado);

        // Operacoes de Strings concatenadas
        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        // Resultado até aqui 5
        System.out.println(resultado++); //imprime a variavel resultado primeiro depois soma 1 resultado na tela 5
        System.out.println(resultado); // agora podemos ver que o valor foi para 6
        System.out.println(++resultado); // soma ou incremta 1 primeiro a variavel resultado e ja imprime
        resultado +=1; // Usado também pra incrementar ou somar 1 a variavel
        System.out.println(resultado);

        //Resultado até aqui 8
        resultado--; // Decrementa o subtrai 1
        System.out.println(resultado);

        System.out.println(resultado--); //imprime a variavel resultado primeiro depois subtrai 1 resultado na tela 7
        System.out.println(resultado); // agora podemos ver que o valor foi para 6
        System.out.println(--resultado); // subtrai ou decrementa 1 primeiro a variavel resultado e ja imprime
        resultado -=1; // Usado também pra decrementar ou subtrair 1 a variavel
        System.out.println(resultado);





    }
}
