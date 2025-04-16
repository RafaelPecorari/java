import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, aux;
        Scanner in = new Scanner(System.in);

        System.out.println("digite dois numeros inteiros separados por espaços: ");
        number1 = in.nextInt();
        number2 = in.nextInt();

        if(number1>number2){
            aux=number1;
            number1 = number2;
            number2 = aux;
        }

    }
}