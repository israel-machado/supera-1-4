package desafio2;

import java.util.Scanner;

class TrocoNotasMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor monetário
        double valor = scanner.nextDouble();

        // Converte o valor para centavos
        int centavos = (int) Math.round(valor * 100);

        // Calcula a quantidade de notas e moedas necessárias
        int[] notas = { 10000, 5000, 2000, 1000, 500, 200 };
        int[] moedas = { 100, 50, 25, 10, 5, 1 };

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = centavos / nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, nota / 100.0);
            centavos %= nota;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidadeMoedas = centavos / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda / 100.0);
            centavos %= moeda;
        }
    }
}
