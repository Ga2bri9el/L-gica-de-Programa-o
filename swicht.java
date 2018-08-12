package teste;

import java.util.Scanner;

public class swicht {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int c = 0;
        int valor = 0;
        int num = 0;
        int f = 0;
        while (c != 99) {
            System.out.println("1-Saque");
            System.out.println("2-Depósito");
            System.out.println("3-Saldo");
            System.out.println("4-Sair");
            System.out.println("Digite um número");
            num = tcl.nextInt();

            switch (num) {
                case 1:
                    f = tcl.nextInt();
                    valor = valor - f;
                    break;
                case 2:
                    f = tcl.nextInt();
                    valor = valor + f;
                    break;
                case 3:
                    System.out.println(valor);
                    break;
                case 4:
                    c = 99;
                    break;
            }
        }
    }
}
