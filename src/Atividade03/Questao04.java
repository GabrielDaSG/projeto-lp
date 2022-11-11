package Atividade03;

import java.text.BreakIterator;
import java.text.spi.BreakIteratorProvider;
import java.util.Scanner;

import javax.print.event.PrintJobListener;

//programa que vai ler uma palavra, se a palavra for diferente de "Java-2022"
// o retorno vai ser "Palavra Errada" se igual "Palavra Ok" a pessoa pode faze no máximo 5 tentativas de acertar a palavra.
public class Questao04 {
   
    Static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
       // Palavra secreta: Java-2022
       System.out.println("Você tem 5 tentativas para acertar a palavra secreta!\n" +
       "Que os jogos comecem!");

    int contar = 5;
    do {

   System.out.println("Digite a palavra secreta: ");
   String palavraSecreta = input.nextLine();

   contar = contar - 1;

   if (palavraSecreta.contentEquals("Java-2022")) {
       System.out.println("Parabéns! Você acertou a palavra secreta!");
       System.exit(0); // pode usar o break; também
   } else {
       System.out.println("Essa não é a palavra secreta...\n" +
               "Tente novamente!");
   }
} while (contar > 0) ;
}
}
