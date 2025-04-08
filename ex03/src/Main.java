import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1, n2, result;

        Scanner in = new Scanner(System.in);
        System.out.println("digite um valor: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        result = (n1+n2)/2;
        if (result>50){
            System.out.println("aprovado");
        }
        else {
            System.out.println("reprovado");

        }
    }
}