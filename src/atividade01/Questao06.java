package Atividade01;

//programa para ler o valor de uma conta e quantas pessoas vão dividir a conta, o sistema vai apresentar quanto cada pessoa vai pagar.

public class Questao06 {
    public static void main(String[] args) {
        System.out.println("Olá, seja bem vindo");
        Scanner input = new Scanner(System.in);
       
        System.out.println("Insira o valor total dos produtos consumidos: ");
        double valorTotal = input.nextDouble();
        double totalMaisGarcom = valorTotal*1.1;
       
        System.out.println("O valor total, com os 10 percento do garçom é: " + totalMaisGarcom);
        System.out.println("Digite a quantidade de pessoas que vão dividir a conta: ");
        double quantidadePessoas = input.nextDouble();
        double valorFinal = totalMaisGarcom/quantidadePessoas;
       
        System.out.println("O valor final a ser pago por cada um é: " + valorFinal);
        System.out.println("Obrigado por ter utilizado o programa! Até a próxima!");
    }
}
