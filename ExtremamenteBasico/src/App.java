import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int X;
        if (A < 0) {
           X = B + A;
        }else{
            X = A + B;
        }
     

        System.out.println("X = " + X);
    }
}
