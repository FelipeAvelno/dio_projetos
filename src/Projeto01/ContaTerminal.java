package Projeto01;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);

            Integer numero;
            String agencia;
            String nomeCliente;
            Float saldo;

            System.out.println("Insira o número da conta: ");
            numero = scanner.nextInt();

            System.out.println("Insira o número da agência");
            agencia = scanner.next();

            System.out.println("Insira seu nome: ");
            nomeCliente = scanner.next();

            System.out.println("Insira seu saldo: ");
            saldo = scanner.nextFloat();

            if (agencia != null && nomeCliente != null && !nomeCliente.isBlank()) {
                System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta número %d e seu saldo de %f já está disponível para saque", nomeCliente, agencia, numero, saldo);
                scanner.close();
            }

            else {
                System.out.println("Você deixou de inserir valores válidos");
                scanner.close();
            }
        } catch (InputMismatchException e) {
            System.out.printf("Erro %s", e);
        }
    }
}
