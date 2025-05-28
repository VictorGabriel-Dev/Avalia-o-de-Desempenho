import java.util.Arrays;

public class BubbleSort {
    int[] numeros = {7, 4, 5, 8, 3, 6, 10, 9};

    public int[] ordenarBubbleSort() {
        int tamanho = numeros.length;
        for (int passagem = 0; passagem < tamanho - 1; passagem++) {
            for (int j = 0; j < tamanho - passagem - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temporario = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporario;
                }
            }

        }
        return numeros;
    }

    @Override
    public String toString() {
        return "Vetor ordenado: " + Arrays.toString(numeros);
    }
}

