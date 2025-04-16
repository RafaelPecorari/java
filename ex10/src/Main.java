import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, prev=0, next=1;
        Scanner in = new Scanner(System.in);
            System.out.println("digite um numero inteiro e positivo: ");
            n = in.nextInt();

            if(n>0){
                while (next<n) {
                    System.out.println(next);
                    prev = next;
                    next = prev;
                }
            }

    }
}