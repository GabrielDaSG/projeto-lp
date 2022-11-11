package Atividade03;

import java.lang.annotation.Repeatable;
import java.util.Scanner;

//programa que vai ler um número, o sistema vai escrever na tela a tabuada de 1 até 10 do número digita

public class Questao01 {
    public static void main(String[] args) {
        //Ativar Scanner.
        Scanner ler = new Scanner(System.in);

        //Mensagem qie irá aparecer para o usuário.
        System.out.println ("Digite um numero:");
        int n1 = ler.nextInt();
        

        //Tabuada de multiplicação.
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s x %s = %s \n", n1, i, i * n1);
         
        }
        ler.close();
}
} 
