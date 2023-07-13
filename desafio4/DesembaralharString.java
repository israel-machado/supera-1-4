package desafio4;

import java.util.Scanner;

public class DesembaralharString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a quantidade de casos de teste
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        // Processa cada caso de teste
        for (int i = 0; i < n; i++) {
            // Lê a linha de entrada
            String linha = scanner.nextLine();

            // Desembaralha a string
            String desembaralhada = desembaralharString(linha);

            // Imprime a string desembaralhada
            System.out.println(desembaralhada);
        }
    }

    private static String desembaralharString(String linha) {
        int tamanho = linha.length();
        StringBuilder sb = new StringBuilder(tamanho);

        // Percorre a metade esquerda da linha de trás para frente
        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        // Percorre a metade direita da linha da frente para trás
        for (int i = tamanho - 1; i >= tamanho / 2; i--) {
            sb.append(linha.charAt(i));
        }

        return sb.toString();
    }
}
