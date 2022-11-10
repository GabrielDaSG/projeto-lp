package atividade01;

import java.util.Scanner;

public class Questao05 {
   
   //Programa vai ler o valor de um jantar  e vai apresentar a taxa de garçom 10%, depois vai apresentar valor do jantar mais as taxas do garçom.
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá! Por favor, insira o valor total dos itens consumidos: ");
        double valorTotal = input.nextDouble();
        double gorgeta = valorTotal * 0.1;
       
        System.out.println("O valor da gorgeta de 10 por cento dos garçons é: " + gorgeta);
        System.out.println("Você deseja adicionar esse valor ao pagamento? Digite S ou N.");
        input.nextLine(); // Pq???
        String simOuNao = input.nextLine(); // Pq??
       
        if ((simOuNao.equalsIgnoreCase("s") || simOuNao.equalsIgnoreCase("sim"))) {
            double valorFinal = valorTotal + gorgeta;
            System.out.println("O valor final é: " + valorFinal);
        } else {
            System.out.println("O valor total é: " + valorTotal);
        }
    }
}
}
