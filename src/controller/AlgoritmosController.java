package controller;

import model.*;
import view.AlgoritmosView;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.nanoTime;

public class AlgoritmosController {
    private AlgoritmosView view = new AlgoritmosView();

    public void iniciar(int[] numeros) {
        while (true) {
            int opcao = view.menu();
            Ordenador algoritmo = null;

            switch (opcao) {
                case 1:
                    algoritmo = new BubbleSort();
                    executarAlgoritmo(algoritmo, numeros);
                    break;
                case 2:
                    algoritmo = new SelectionSort();
                    executarAlgoritmo(algoritmo, numeros);
                    break;
                case 3:
                    algoritmo = new HeapSort();
                    executarAlgoritmo(algoritmo, numeros);
                    break;
                case 4:
                    executarTodos(numeros);
                    break;
                case 0:
                    view.sair();
                    return;
                default:
                    view.invalido();
            }
        }
    }

    private void executarAlgoritmo(Ordenador algoritmo, int[] numeros) {
        long inicio = nanoTime();
        int[] resultado = algoritmo.ordenar(numeros.clone());
        long fim = nanoTime();
        long duracao = fim - inicio;

        view.mostrarResultado(algoritmo.getClass().getSimpleName(), resultado, duracao);
    }

    private void executarTodos(int[] numeros) {
        Map<String, Long> tempos = new LinkedHashMap<>(); // Mantém a ordem de inserção

        tempos.put("BubbleSort", medirTempo(new BubbleSort(), numeros));
        tempos.put("SelectionSort", medirTempo(new SelectionSort(), numeros));
        tempos.put("HeapSort", medirTempo(new HeapSort(), numeros));

        view.mostrarTabelaComparativa(tempos);
    }

    private long medirTempo(Ordenador algoritmo, int[] numeros) {
        long inicio = nanoTime();
        algoritmo.ordenar(numeros.clone());
        long fim = nanoTime();
        return fim - inicio;
    }
}
