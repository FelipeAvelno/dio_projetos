import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int num01 = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int num02 = scanner.nextInt();

        try {
            contar(num01, num02);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }

    public static void contar(int num01, int num02) throws ParametrosInvalidosException {
        if (num01 > num02) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = num02 - num01;

        for (int i = 0; i <= contagem; i++) {
            System.out.printf("\nImprimindo número %d", i);
        }
    }
}
