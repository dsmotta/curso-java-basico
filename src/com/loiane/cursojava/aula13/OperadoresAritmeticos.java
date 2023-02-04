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

        // Operações de Strings concatenadas
        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);



    }
}
