import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Entrada: horas e minutos de início e fim
        int h_inicial = sc.nextInt();
        int min_inicial = sc.nextInt();
        int h_final = sc.nextInt();
        int min_final = sc.nextInt();
        // Converter para minutos totais
        int tempo_inicial = h_inicial * 60 + min_inicial;
        int tempo_final = h_final * 60 + min_final;

        int duracao_total, duracao_h, duracao_min; 

        if (tempo_inicial == tempo_final) {
            // Duração de 24 horas
            duracao_total = 1440;
        }else if (tempo_final > tempo_inicial) {
            duracao_total = tempo_final - tempo_inicial;
        }else{
            // Caso o jogo atravesse a meia-noite
            duracao_total = (1440 - tempo_inicial) + tempo_final;
        }
        // Converter duração total para horas e minutos
        duracao_h = duracao_total / 60;
        duracao_min = duracao_total % 60;

        System.out.println("O JOGO DUROU " + duracao_h + " HORA(S) E " + duracao_min + " MINUTO(S)");
    }
}
