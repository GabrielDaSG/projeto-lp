package Atividade02;

import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int n1 = ler.nextInt();
        
        System.out.println( "Digite o segundo número:");
        int n2 = ler.nextInt();
        
        System.out.println("Digite o terceiro número:");
        int n3 = ler.nextInt();
        int maior;

        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
        } else (n3 >= n2 && n3 >= n1) {
           maior = n3;
        }
        
        int menor;
        if (n1 <= n2 && n1 <= n3) {
            maior = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            maior = n2;
        } else (n3 <= n2 && n3 <= n1) {
           maior = n3;
        }

        System.out.println("maior" + maior);
        System.out.println("menor" + menor);
        ler.close();
    }
}