package desafio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ContagemParesDeDiferenca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o tamanho do array e o valor alvo
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Cria o array e lê os valores
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Cria um mapa para contar a frequência dos elementos
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Conta a frequência dos elementos do array
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Conta o número de pares com diferença igual a k
        int count = 0;
        for (int num : arr) {
            int complement = num + k;
            if (frequencyMap.containsKey(complement)) {
                count += frequencyMap.get(complement);
            }
        }

        System.out.println(count);
    }
}
