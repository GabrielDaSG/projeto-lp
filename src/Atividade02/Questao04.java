package Atividade02;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        //ferramenta para leitura.
        Scanner ler = new Scanner(System.in);
        //mensagem de digite um numero.
        System.out.println("Digite sua idade:");
        //ler numero.
        int n1 = ler.nextInt();
        if (n1>=18) {
            System.out.println("Pode dirigir.");
        }else (n1<18) {
            System.out.println("Não pode dirigir.");
        }
        ler.close();
    }
}