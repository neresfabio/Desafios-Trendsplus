import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (input.equals("vertebrado") ) {
            input = sc.next();
            if(input.equals("ave")){
                input = sc.next();
                if (input.equals("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                input = sc.next();
                if (input.equals("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            //invertebrado
            input = sc.next();
            if (input.equals("inseto")){
                input = sc.next();
                if (input.equals("hematofago")) {
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                input = sc.next();
                if (input.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }

            }
        }

    }
}