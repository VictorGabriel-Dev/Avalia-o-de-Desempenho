package controller;

import model.*;
import view.AlgoritmosView;

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
                    break;
                case 2:
                    algoritmo = new SelectionSort();
                    break;
                case 3:
                    algoritmo = new HeapSort();
                    break;
                case 0:
                    view.sair();
                    return;
                default:
                    view.invalido();
                    continue;
            }

            long inicio = nanoTime();
            int[] resultado = algoritmo.ordenar(numeros.clone());
            long fim = nanoTime();

            long duracao = fim - inicio;
            view.mostrarResultado(algoritmo.getClass().getSimpleName(), resultado, duracao);
        }
    }
}
