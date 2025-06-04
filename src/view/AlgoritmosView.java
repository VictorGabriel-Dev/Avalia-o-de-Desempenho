package view;

import java.util.Scanner;
import java.util.Map;

public class AlgoritmosView {
    Scanner scanner = new Scanner(System.in);

    public int menu() {
        System.out.println("\n--- Escolha o algoritmo de ordenação ---");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Heap Sort");
        System.out.println("4 - Executar todos e mostrar tabela");
        System.out.println("0 - Sair");

        System.out.print("Opção: ");
        return scanner.nextInt();
    }

    public void mostrarResultado(String nomeAlgoritmo, int[] resultado, long duracaoNano) {
        System.out.print(nomeAlgoritmo + " Resultado: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }

        double duracaoMili = duracaoNano / 1_000_000.0;
        double duracaoSeg = duracaoNano / 1_000_000_000.0;

        System.out.println("\n----------------------------------------------");
        System.out.println("Algoritmo       | Nanosegundos | Milissegundos | Segundos");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-15s| %-13d| %-15.3f| %-8.6f%n",
                nomeAlgoritmo, duracaoNano, duracaoMili, duracaoSeg);
        System.out.println("-----------------------------------------------------------\n");
    }

    public void mostrarTabelaComparativa(Map<String, Long> tempos) {
        System.out.println("\n--- Tabela Comparativa de Desempenho ---");
        System.out.println("Algoritmo       | Nanosegundos | Milissegundos | Segundos");
        System.out.println("-----------------------------------------------------------");

        for (Map.Entry<String, Long> entry : tempos.entrySet()) {
            long nano = entry.getValue();
            double mili = nano / 1_000_000.0;
            double seg = nano / 1_000_000_000.0;
            System.out.printf("%-15s| %-13d| %-15.3f| %-8.6f%n",
                    entry.getKey(), nano, mili, seg);
        }

        System.out.println("-----------------------------------------------------------\n");
    }

    public void invalido() {
        System.out.println("Opção inválida.");
    }

    public void sair() {
        System.out.println("Encerrando...");
    }
}
