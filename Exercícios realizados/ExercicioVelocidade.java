//Exercício 5 — Velocidade
//Leia a velocidade de um carro (int). Classifique:
//Até 60: "Velocidade normal"
//Entre 61 e 80: "Atencao: velocidade moderada"
//Acima de 80: "Perigo: velocidade alta"
import java.util.Scanner;

public class ExercicioVelocidade {
    public static void main(String[] args){
        Scanner mavinha = new Scanner(System.in);
        int velocidade;

        System.out.println("Verifique sua velocidade: ");
        velocidade = mavinha.nextInt();

        if(velocidade <= 60) {
            System.out.println("Velocidade normal");
        } else if (velocidade >= 61 && velocidade <= 80) {
            System.out.println("Atenção: Velocidade moderada");
        } else {
            System.out.println("Perigo: velocidade alta");
        }
        mavinha.close();

        }
    
    }
