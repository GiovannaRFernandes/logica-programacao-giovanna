//Exercício 3— Classificação de idade
//Leia a idade (int) do usuário e classifique:
//Menor que 12: criança
//Entre 12 e 17: adolescente
//Entre 18 e 59: adulto
//60 ou mais: idoso

import java.util.Scanner;

public class ExercicioClassificacaoIdade {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        if(idade < 12 ){
            System.out.println("Você é criança");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Você é adolescente");
        } else if (idade >= 18 && idade <= 59 ) {
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é idoso");
        }

        leitor.close();
    }
    
}
