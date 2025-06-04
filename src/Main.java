import controller.AlgoritmosController;
import model.LeitorArquivo;

public class Main {
    public static void main(String[] args) {
        int[] numeros = LeitorArquivo.lerArquivo("dados1.txt");
        if (numeros != null) {
            new AlgoritmosController().iniciar(numeros);
        }
    }
}
