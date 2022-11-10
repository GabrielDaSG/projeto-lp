package atividade01

import java.util.Scanner;

public class Questao04 {
    
    // Programa que vai ler Nome, valor da hora e quantas horas foram trabalhadas e o sistema vai retornar o salário do colaborador.
    
    public static void main(String[] args) {
        System.out.println("Por favor, digite as informações que serão solicitadas!");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nome do colaborador: ");
        String nome = input.nextLine();
        
        System.out.println("Digite o valor da hora trabalhada:");
        double valorHora = input.nextDouble();
        
        System.out.println("Horas trabalhadas esse mês: ");
        double horasTrabalhadas = input.nextDouble();
        double salario = valorHora * horasTrabalhadas;
        System.out.println(nome + " receberá" + salario + " reais de salário!");
        System.out.println("Obrigado!");
    }
}