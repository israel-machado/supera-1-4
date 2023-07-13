package desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class OrdenacaoParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número de linhas de entrada
        int n = scanner.nextInt();

        // Lista para armazenar os valores pares
        List<Integer> pares = new ArrayList<>();

        // Lista para armazenar os valores ímpares
        List<Integer> impares = new ArrayList<>();

        // Lê os valores de entrada e os separa em pares e ímpares
        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        // Ordena a lista de pares em ordem crescente
        Collections.sort(pares);

        // Ordena a lista de ímpares em ordem decrescente
        Collections.sort(impares, Comparator.reverseOrder());

        // Imprime os valores pares
        for (int valor : pares) {
            System.out.println(valor);
        }

        // Imprime os valores ímpares
        for (int valor : impares) {
            System.out.println(valor);
        }
    }
}
