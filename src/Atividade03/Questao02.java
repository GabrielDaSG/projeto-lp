package Atividade03;

import java.util.Scanner;

//programa que vai ler uma mensagem e um número, o sistema vai repetir a mensagem digitada x vezes o número digitado.
public class Questao02 {
    public static void main(String[] args) {
        //Ativar o Scanner.
        Scanner ler = new Scanner(System.in);

        //Mensagem que vai aparecer pro usuário.
        System.out.println("Escreva uma mensagem:");
        String msg = ler.nextLine();
        
        System.out.println("Escreva quantas vezes deseja repetir:");
        int n1 = ler.nextInt();
        
        //Condições.
        for (int i = 0; i <=n1; i = i + 1) {
            System.out.println(msg);
    }
}
}
