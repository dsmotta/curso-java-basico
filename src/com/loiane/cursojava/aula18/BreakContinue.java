package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        //Break usado quando precisamos sair do laço de repetição
        System.out.println("Entre com um numero ");
        int num = scan.nextInt();

        System.out.println("Entre com o limite: ");
        int max = scan.nextInt();

        for (int i=num; i <= max; i++){
            if(i % 7 == 0){
                System.out.println("valor de i: " + i);
                break; //usado para sair do laço de repetição
            }
        }
        */
        //Uso do break com rótulos ou label - goto
        // Não é muito usado
       /* for(int i=0; i<=4; i++){
            rotulo1:{
                rotulo2:{
                    rotulo3:{
                        if(i == 1){ //executado quando o i for igual a 1
                            break rotulo1;
                        }
                        if(i == 2){
                            break rotulo2; //executado quando o i for igual a 2
                        }
                        if(i == 3){
                            break rotulo3; //executado quando o i for igual a 3
                        }
                        System.out.println("rotulo 3"); //trecho a ser executado quando i = 3
                    }
                    System.out.println("rotulo 2"); //trecho a ser executado quando i = 2
                }
                System.out.println("rotulo 1"); //trecho a ser executado quando i = 1
            }
            System.out.println(i); // neste ponto estamos dentro do for
        }*/

        //Ex de uso do continue
        //mais usado em laços de repetição aninhados
        System.out.println("Entre com um numero ");
        int num = scan.nextInt();

        System.out.println("Entre com o limite: ");
        int max = scan.nextInt();

        for (int i=num; i <= max; i++){
            if(i % 7 == 0){ // se for divisivel por 7 e o restante for igual a zero não será incluido
                continue; // mesmo sendo verdadeira a condição volta para o for
            }
            System.out.println("valor de i: " + i); // será executado somente quando terminar o laço no caso o for
        }

    }
}
