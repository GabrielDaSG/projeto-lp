package Atividade02;

// programa que dada a idade de uma pessoa, retorna uma das seguintes mensagens: 
//“Não pode nem votar e nem dirigir”, “Pode votar, mas não pode dirigir”, “Pode votar e pode dirigir”.

public class Questao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        System.out.println("Por favor, insira a idade da pessoa: ");
        int idade = input.nextInt();
        
        if (idade < 16) {
            System.out.println("Essa pessoa não pode votar, nem dirigir!");
        } else if (idade < 18 || idade >= 60) {
            if (idade < 18) {
                System.out.println("Essa pessoa pode escolher se quer ou não votar, " +
                        "mas não pode dirigir!");
            } else {
                System.out.println("Essa pessoa pode escolher se quer ou não votar, " +
                        "e ainda pode dirigir se conseguir!");
            }
        } else {
            System.out.println("Essa pessoa precisa votar e pode dirigir!");
        }
    }
}
