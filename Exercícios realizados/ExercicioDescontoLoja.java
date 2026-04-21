//Exercício — Desconto em loja
//Leia o valor de uma compra (double). Calcule o desconto conforme as faixas:
//Até R$100: sem desconto
//Entre R$101 e R$300: 10% de desconto
//Acima de R$300: 20% de desconto
//Mostre o valor do desconto e o valor final a pagar.
import java.util.Scanner;

public class ExercicioDescontoLoja {
    public static void main(String[] args){
        Scanner mavinha = new Scanner(System.in);
        double valor, valorFinal;
        double desconto = 0;

        System.out.println("Digite o valor da sua compra e descubra seu desconto: ");
        valor = mavinha.nextDouble();

        if(valor <= 100){
            desconto = 0;
            System.out.println("Sem Desconto :(");
        } else if (valor >= 101 && valor <= 300){
            desconto = valor * 0.10;
        } else {
            desconto = valor *0.20;
        }

        valorFinal = valor - desconto;
        System.out.println("Desconto de R$" + desconto);
        System.out.println("O valor final da sua compra será de R$" + valorFinal);

        mavinha.close();
    }
}
