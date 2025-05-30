package model;
public class SelectionSort implements Ordenador {
    @Override
    public int[] ordenar(int[] numeros) {
        int n = numeros.length;

        for(int i=0; i < n -1; i++){
            int min_idx = i;

            for (int j = i+1; j < n; j++){
                if (numeros[j] < numeros[min_idx]){
                    min_idx = j;
                }
            }

            int temp = numeros[i];
            numeros[i] = numeros[min_idx];
            numeros[min_idx] = temp;
        }
        return numeros;
    }
}