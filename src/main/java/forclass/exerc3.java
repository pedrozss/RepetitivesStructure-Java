package forclass;

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double media = 0;
        double soma = 0;


        for (int i = 0 ; i < N ; i++) {
            double n = sc.nextDouble();

            if (i == 0) {
                soma += n * 2;
            } else if (i == 1) {
                soma += n * 3;
            } else if (i == 2) {
                soma += n * 5;
            }


        }

        media = (soma) / 10;

        System.out.printf("%.1f", media);

    }
}
