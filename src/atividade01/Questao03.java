package Atividade01;

//programa para ler um nome digitado e mostrar a mensagem "Olá <nome-digitado>".


public class Questao03 {
    public static void main(String[] args) {
        System.out.println("Por favor, digite o seu nome:");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
       
        System.out.println("Olá, " + nome + "!\n" +
                "Tenha um excelente dia!");
    }
}
