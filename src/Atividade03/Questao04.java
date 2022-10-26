package Atividade03;

import java.text.BreakIterator;
import java.text.spi.BreakIteratorProvider;
import java.util.Scanner;

import javax.print.event.PrintJobListener;

//programa que vai ler uma palavra, se a palavra for diferente de "Java-2022" o retorno vai ser "Palavra Errada" se igual "Palavra Ok" a pessoa pode faze no máximo 5 tentativas de acertar a palavra.
public class Questao04 {
   
    Static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
    do{

        System.out.println("Digite a palavra secreta");
        String PalavraSecreta = ler.nextInt;
        int i = 0;

        if (PalavraSecreta.equals("Digite uma palavra) Tentativa" + i + "/5")) {
            System.out.println("Parabens! Você acertou a palavra secreta!");    
        } else {
            System.out.println("Essa não é a palavra correta");
        }
        while (!PalavraSecreta.equals("Java-2022") && i <= 5);           
        }
     }
    }
    ler.close();
}