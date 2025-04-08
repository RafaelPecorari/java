import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1, n2, n3, n4, result;

        Scanner in = new Scanner(System.in);
        System.out.println("digite um valor: ");
        n1 = in.nextDouble();
        System.out.println("digite um valor: ");
        n2 = in.nextDouble();
        System.out.println("digite um valor: ");
        n3 = in.nextDouble();
        System.out.println("digite um valor: ");
        n4 = in.nextDouble();

        result = (n1 + n2 + n3 + n4) / 4;
        if (result >= 8.5) {
            System.out.println("a");
        } 
        else if (result >= 7) {
            System.out.println("b");
        } else if (result >= 5) {
            System.out.println("c");
        }
        else {
            System.out.println("d");
        }
    }    
}