package com.loiane.cursojava.aula13;

public class OperadoresLogicos {

    public static void main(String[] args) {

        int valor1 = 1;
        int valor2 = 2;

        Boolean resultado1 = (valor1 == 1) && (valor2 == 2); // Testa se as duas condições são verdadeiras
        System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);

        boolean resultado2 = (valor1 ==1) || (valor2 ==2); // Testa se uma das condições é verdadeira
        System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println( verdadeiro && falso);
        System.out.println( verdadeiro || falso);
        System.out.println( verdadeiro ^ falso);
        System.out.println( !verdadeiro && falso);

    }
}
