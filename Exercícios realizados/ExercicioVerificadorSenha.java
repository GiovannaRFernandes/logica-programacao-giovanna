//Exercício — Verificador de senha
//Leia a senha digitada pelo usuário (int). Se for igual a 1234, mostre "ACESSO PERMITIDO". Caso contrário, mostre "ACESSO NEGADO".
import java.util.Scanner;

public class ExercicioVerificadorSenha {
    public static void main(String[] args){
        Scanner mavinha = new Scanner(System.in);
        int senha;

        System.out.println("Digite a senha para acessar: ");
        senha = mavinha.nextInt();

        if(senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    mavinha.close();
    }
}
