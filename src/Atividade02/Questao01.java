package Atividade02;

//programa que leia um número e escreva na tela se o número é menor, igual ou maior que zero

import java.util.Scanner;


    public class Questao01 {
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
           
            System.out.print("Por favor, digite o número: ");
            double n = input.nextDouble();
            if (n > 0) {
                System.out.println("Esse número é maior que 0!");
            }
            if (n == 0) {
                System.out.println("Esse número é igual a 0!");
            }
            if (n < 0) {
                System.out.println("Esse número é menor que zero!");
            }
        }
    }  