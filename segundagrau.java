package exer01;

import java.util.Scanner;

public class segundagrau {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite os valores de a,b,c");
        int a = tcl.nextInt();
        int b = tcl.nextInt();
        int c = tcl.nextInt();
        double delta = ((b * b) - 4 * a * c);
        System.out.println(delta);
        double x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
        double x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
        System.out.println("a primeira raiz é " + x1 + " a segunda raiz é " + x2);
        if (a > 0) {
            System.out.println("a parábola é para cima");
        } else {
            System.out.println("a parábola é para baixo");
        }
    }
}
