package com.loiane.cursojava.aula13;

public class CurtoCircuito {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resulta1 = falso &
                verdadeiro;
        boolean  resultado2 = falso &&
                verdadeiro;
        System.out.println(resulta1);
        System.out.println(resultado2);

    }
}
