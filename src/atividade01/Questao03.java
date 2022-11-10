package atividade01;

import java.util.Scanner;
public class Questao03 {
  
  //Programa vai ler o Nome digitado pelo usuário e retornará Ola + nome digitado.
  
    public static void main(String[] args) {
        System.out.println("Olá, muito bem vindo!\n" +
                "Por favor, digite o seu nome: ");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        System.out.println("Olá, " + nome + "!\n" +
                "Tenha um excelente dia!");
    }
}
