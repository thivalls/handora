package application.recursive;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que quer calcular o fatorial");
        int typedNumber = scan.nextInt();

        System.out.println(fatorial(typedNumber));
    }

    public static int fatorial (int num) {
        if (num == 0) {
            return 1;
        }

        return num * fatorial(num -1);
    }
}
