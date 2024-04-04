package whileclass;

import java.util.Scanner;

public class exerc3sc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        System.out.println("Digite o código: ");
        int tipo = sc.nextInt();

        while (tipo != 4) {
            switch (tipo) {
                case 1:
                    alcool = alcool + 1;
                    break;

                case 2:
                    gasolina = gasolina + 1;
                    break;

                case 3:
                    diesel = diesel + 1;
                    break;

                default:
                    System.out.println("Valor inválido, digite novamente!");
                    break;

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

