package Atividade02;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        //Ativar o scanner.
        Scanner ler = new Scanner(System.in);
        //Mensagem para digitar numero.
        System.out.println("Digite um numero");
        int n1 = ler.nextInt();
        
        if (n1<0){ 
            System.out.println("Menor que zero");
        }else if (n1=0) {
            System.out.println("Igual a zero");
        }else (n1>0) {
            System.out.println("Maior que zero");
        }
        ler.close();
    }
}