package model;

public class BubbleSort implements Ordenador {

@Override
    public int[] ordenar(int[] numeros) {
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
}

