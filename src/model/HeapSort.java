package model;

public class HeapSort implements Ordenador{
  @Override
    public int[] ordenar(int[] arr) {
        int n = arr.length;

        // Constrói o heap (reorganiza o array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extrai elementos do heap, um por um
        for (int i = n - 1; i > 0; i--) {
            // Move a raiz (maior elemento) para o final
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Reaplica o heapify no heap reduzido
            heapify(arr, i, 0);
        }
        return arr;
    }

    // Função para manter a propriedade de heap
    void heapify(int[] arr, int n, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        // Se filho da esquerda é maior que o pai
        if (esquerda < n && arr[esquerda] > arr[maior]) {
            maior = esquerda;
        }

        // Se filho da direita é maior que o maior atual
        if (direita < n && arr[direita] > arr[maior]) {
            maior = direita;
        }

        // Se o maior não é a raiz
        if (maior != i) {
            int troca = arr[i];
            arr[i] = arr[maior];
            arr[maior] = troca;

            // Recursivamente aplica o heapify
            heapify(arr, n, maior);
        }
    }
}
