package forclass;

import java.util.Scanner;

public class fortest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            soma = soma + x;


        }

        System.out.println(soma);


    }
}
