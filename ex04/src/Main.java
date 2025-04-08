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
            double n3;

            Scanner inScanner = new Scanner(System.in);
            System.out.println("digite um valor: ");
            n3 = in.nextDouble();
            result = (result)/3;
            if (result<50){
                System.out.println("aprovado");
            }
            else {
                System.out.println("reprovado");
            }

        }
    }
}