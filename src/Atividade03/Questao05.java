package Atividade03;

import java.util.Scanner;

//programa que vai ler a idade de 5 pessoas, o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor.

public class Questao05 {
    //Ativar Scanner.
    Scanner ler = new Scanner(System.in);

   //Variaveis.
   int qtMaior = 0;
   int qtMenor = 0;

    for (int i  = 1; i <= 5; i++) {
    System.out.println("Digite a idade:");
    int idade = ler.nextInt();
    
    if(idade >= 18){
        qtMaior++;
    } else {
        qtMenor++;
    }
   }
   System.out.println(qtMaior+"São maior de idade.");
   System.out.println(qtMenor+"São menor de idade.");

}
