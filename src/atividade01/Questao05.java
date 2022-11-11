package Atividade01;

//programa para ler o valor de um jantar, o sistema vai apresentar a taxa do garçom 10% e também o valor
//<valor refeição> + 10% = <final total>.

public class Questao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Olá! Insira o valor de todos os itens consumidos: ");
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
