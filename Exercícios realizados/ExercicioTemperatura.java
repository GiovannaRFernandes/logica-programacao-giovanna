// Exercício 01 — Temperatura: Leia a temperatura atual (double). Se estiver entre 15°C e 25°C, mostre "Temperatura dentro dos limites seguros". 
// Caso contrário, mostre "Atencao! Temperatura fora dos limites seguros".

import java.util.Scanner;

public class ExercicioTemperatura {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double temperatura;

        System.out.println("***VERIFICADOR DE TEMPERATURA***");
        System.out.println("Digite a temperatura: ");
        temperatura = leitura.nextDouble();

        if (temperatura >= 15 && temperatura <= 25) {
            System.out.println("Temperatura dentro dos limites seguros");
        } else {
            System.out.println("Atencão! Temperatura fora dos limites seguros");
        }

        leitura.close();
    }
}
