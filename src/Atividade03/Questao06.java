package Atividade03;

public class Questao06 {
    //Ativar Scanner
    Scanner ler = new Scanner(System.in);

    //Variaveis
    int maior = 0;
    int menor = -1000;
    int soma = 0

    //condição.
    for (int i  = 1; i <= 5; i++) {
    System.out.println("Digite um numero:");
    int num = ler.nextInt();
    if(num > maior) {
        maior = num;
    } 
    if (num < menor) {
        menor = num;
    }
    soma = soma + num;
   }
   System.out.println("Maior =" + maior);
   System.out.println("Menor =" + menor);
   System.out.println("Soma = " + soma);
   System.out.println("Media=" + (soma /));
}
