package Atividade01;

// Programa para ler um número e o sistema vai mostra os números vizinhos, o anterior e o próximo número.

public public static void main(String[] args) {
    System.out.println("Bem vindo ao sistema de contagem de números!");
    Scanner input = new Scanner (System.in);
   
    System.out.print("Digite um número inteiro: ");
    int numero1 = input.nextInt();
    int numero2 = numero1 - 1;
    int numero3 = numero1 + 1;
   
    System.out.println("Os números vizinhos à " + numero1 + " são " + numero2 + " e " + numero3 + "!");
    System.out.println("Tenha um excelente trabalho!");
} {
    
}
