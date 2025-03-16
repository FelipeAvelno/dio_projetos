package Projeto03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        double saldoFinal = saldoInicial;

        double[] transacoes = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira o %d valor da transação: ", i + 1);
            transacoes[i] = scanner.nextDouble();
            saldoFinal += transacoes[i];
        }

        System.out.printf("Saldo final: %.2f%n", saldoFinal);
        scanner.close();
    }
}
