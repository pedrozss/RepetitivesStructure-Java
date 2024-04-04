package whileclass;

import java.util.Scanner;

public class exerc3ie {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        System.out.println("Digite o código: ");
        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            } else if (tipo == 2) {
                gasolina = gasolina + 1;
            } else if (tipo == 3) {
                diesel = diesel + 1;
            } else {
                System.out.println("Valor inválido!");
            }

            tipo = sc.nextInt();

        }

        System.out.println("Total de produtos: ");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        System.out.println();
        System.out.println("Muito Obrigado!");
    }
}
