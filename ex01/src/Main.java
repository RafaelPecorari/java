import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, result;

        Scanner in = new Scanner(System.in);
        System.out.println("digite um valor: ");
        n = in.nextInt();
        if(n>1){
            System.out.println("Raiz de " + n + " = " + Math.sqrt(n));}
        else {
            System.out.println("valor invalido");
        }
    }
}