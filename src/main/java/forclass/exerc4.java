package forclass;

// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double soma = 0;

        for (int i = 0; i < N; i++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            if (n2 == 0) {
                System.out.println("Divisão impossível");
            } else {
                soma = n1 / n2;

                System.out.println(soma);

            }

        }

    }
}
