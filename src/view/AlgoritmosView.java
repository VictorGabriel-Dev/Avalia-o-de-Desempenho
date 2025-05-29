package view;

import java.util.Scanner;

public class AlgoritmosView {
    Scanner scanner = new Scanner(System.in);
    public int menu(){
        System.out.println("\n--- Escolha o algoritmo de ordenação ---");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Heap Sort");
        System.out.println("0 - Sair");

        System.out.print("Opção: ");
        return scanner.nextInt();
    }

    public void mostrarResultado(String nomeAlgoritmo, int[] resultado) {
        System.out.print(nomeAlgoritmo + ": ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void invalido() {
        System.out.println("Opção inválida.");
    }
    public  void sair(){
        System.out.println("Encerrando...");
    }

}
