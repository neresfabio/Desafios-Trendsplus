import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long qtdAnagramas = 1;

        /*
        for (int i = 1; i <= S.length(); i++) {
            System.out.println(i);
        } 
        */

        // Enquanto S for diferente de "0"

        while (S.equals("0") == false) {
            if(S.length() < 16) {
                for (int i = S.length(); i >= 1; i--) {
                    qtdAnagramas = qtdAnagramas * i;
                }
                System.out.println(qtdAnagramas);
            }
            qtdAnagramas = 1;
            S = sc.next();
        }

        
        

        System.out.println("Tamanho da string: " + S.length());
    }
}