import java.util.Arrays;

public class BubbleSort {
    int[] vetor = {7, 4, 5, 8, 3, 6, 10, 9};

    public int[] ordenarBubbleSort() {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }

        }
        return vetor;
    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "vetor=" + Arrays.toString(vetor) +
                '}';
    }
}

