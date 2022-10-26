package Atividade02;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        //ferramenta para leitura.
        Scanner ler = new Scanner(System.in);
        //mensagem de digite um numero.
        System.out.println("Digite sua idade:");
        //ler numero.
        int n1 = ler.nextInt();
        if (n1>=16) {
            System.out.println("Pode votar.");
        }else (n1<16) {
            System.out.println("Não pode votar.");
        }
        ler.close();
    }
}