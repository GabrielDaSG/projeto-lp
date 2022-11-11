package Atividade01;

//programa para ler o nome, valor da hora, quantas horas trabalhadas, o sistema vai apresentar o salário.
//<fulano> vai receber R$<00.00>

public class Questao04 {
    public static void main(String[] args) {
        System.out.println("Olá! Por favor, digite as informações que serão solicitadas!");
        Scanner input = new Scanner(System.in);
       
        System.out.print("Digite o nome do colaborador: ");
        String nome = input.nextLine();
       
        System.out.println("Digite o valor da hora trabalhada desse colaborador: ");
        double valorHora = input.nextDouble();
       
        System.out.println("Digite quantas horas esse colaborador trabalhou nesse mês:");
        double horasTrabalhadas = input.nextDouble();
        double salario = valorHora * horasTrabalhadas;
       
        System.out.println(nome + " receberá, neste mês " + salario + " reais de salário!");
        System.out.println ("Obrigado. Até a próxima!");
    }
}
