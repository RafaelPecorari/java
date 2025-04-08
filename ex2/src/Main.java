import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1, n2;

        Scanner in = new Scanner(System.in);
        System.out.println("digite um valor: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        if (n1>n2){
            System.out.println("o "+ n1+ " é maior");
        }
        else {
            System.out.println("o "+ n2+ " é maior");

        }
    }
}