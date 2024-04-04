package whileclass;

import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;

        System.out.println("Digite a senha: ");

        while (x != 2002) {
            x = sc.nextInt();
            System.out.println("Senha inválida!");

        }

        System.out.println("Acesso permitido!");
    }
}
