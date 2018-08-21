package exer01;

import java.util.Scanner;

public class doisvalue {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int a = tcl.nextInt();
        int b = tcl.nextInt();
        if (a > b) {
            System.out.println("o maior valor é " + a + " e o menor é " + b);
        } else if (b > a) {
            System.out.println("o maior valor é " + b + " e o menor é " + a);
        } else {
            System.out.println("o valor de " + a + " e " + b + " são iguais");
        }

    }
}
