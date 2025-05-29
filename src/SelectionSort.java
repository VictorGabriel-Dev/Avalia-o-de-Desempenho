public class SelectionSort {
    static void selectionSort(int [] valor){
        int n = valor.length;

        for(int i=0; i< n -1; i++){
            int menor_idx = i;

            for(int j= i+1; j< n; j++){
                if(valor[j] < valor[menor_idx]){
                    menor_idx = j;
                }
            }
        }
    }
}
