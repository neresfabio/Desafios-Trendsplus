import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Numero de casos de teste
        int N = sc.nextInt();
        sc.nextLine();
        // Enquanto houver casos de teste
        while (N > 0) {
            // Entrada da frase
            String linha = sc.nextLine();
            // Divide a linha em palavras e converte para lista
            List<String> palavras = new ArrayList<>(Arrays.asList(linha.split(" ")));
            // Ordena as palavras do maior para o menor tamanho, mantendo a ordem em caso de empate
            Collections.sort(palavras, (a, b) -> Integer.compare(b.length(), a.length()));

            // Imprime as palavras ordenadas sem espaço extra no final
            System.out.println(String.join(" ", palavras));
            // Decrementa o numero de casos de teste
            N--;
        }
       
    }
}
