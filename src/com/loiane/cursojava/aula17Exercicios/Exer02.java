package com.loiane.cursojava.aula17Exercicios;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        // Leia o nome do usuario e senha não aceite senha igual ao nome do usuario, mostrando mensagem de erro
        // e voltando a perdir informações

        Scanner scan = new Scanner(System.in);
        boolean testeSenha = false;
        String nomeUser;
        String senha;

        do{
            System.out.println("Entre com o nome do usuario: ");
            nomeUser = scan.next();

            System.out.println("Entre com a senha: ");
            senha = scan.next();

            if(nomeUser.equals(senha)){
                System.out.println("Senha igual a usuário, digite novamente!");
                testeSenha = false;
            }else {
                System.out.println("Senha e usuario validos!");
                testeSenha = true;
            }

        }while (!testeSenha);

    }
}
