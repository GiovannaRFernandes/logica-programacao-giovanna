//Exercício 2 — Imposto de renda: Leia o salário (double) de um trabalhador e calcule o imposto conforme as faixas:
//Até R$2.000: isento
// Entre R$2.001 e R$3.500: 10%
//Entre R$3.501 e R$5.000: 20%
//Acima de R$5.000: 30%
//Mostre a faixa e o valor do imposto a pagar.

import java.util.Scanner;

public class ExercicioImpostoRenda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salario, imposto = 0;

        System.out.println("Digite seu salário e descubra o valor do imposto de renda a ser declarado: ");
        salario = leitor.nextDouble();

        if (salario <= 2000) {
            imposto = 0;
            System.out.println("ISENTO");
        } else if (salario <= 3500) {
            imposto = salario * 0.10;
            System.out.println("Você vai pagar 10% de imposto");
        } else if (salario <= 5000) {
            imposto = salario * 0.20;
            System.out.println("Você vai pagar 20% de imposto");
        } else {
            imposto = salario * 0.30;
            System.out.println("Você vai pagar 30% de imposto");
        }

        System.out.println("Valor do imposto: R$ " + imposto);

        leitor.close();
    }
}
