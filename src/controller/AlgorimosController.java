package controller;

import model.BubbleSort;
import model.Ordenador;
import view.AlgoritmosView;

public class AlgorimosController {
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
                   // algoritmo = new SelectionSort();
                    break;
                case 3:
                    //algoritmo = new HeapSort();
                    break;
                case 0:
                    view.sair();
                    return;
                default:
                    view.invalido();
                    continue;
            }

            int[] resultado = algoritmo.ordenar(numeros);
            view.mostrarResultado(algoritmo.getClass().getSimpleName(), resultado);
        }
    }
}
