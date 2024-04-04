package whileclass;

import java.util.Scanner;

public class structwhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int soma = 0;

        while (n1 != 0) {
            soma = soma + n1;
            n1 = sc.nextInt();
        }

        System.out.println(soma);


    }
}
