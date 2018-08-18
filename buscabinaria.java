package exer01;

import java.util.Scanner;

public class buscabinaria {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int vetor[] = new int[5];
        System.out.println("Qual o vetor?");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }
        System.out.println("Qual número procura?");
        int c = tcl.nextInt();
        boolean match = true;
        int min = 0, max = vetor.length;
        int meio;
        while (match) {
            meio = (min + max) / 2;
            if (meio > vetor.length - 1 || max < 0) {
                System.out.println("Não encontrado");
                break;
            }
            if (c == vetor[meio]) {
                match = false;
                System.out.println("Posição:" + meio);
            } else if (c < vetor[meio]) {
                max = meio - 1;
            } else if (c > vetor[meio]) {
                min = meio + 1;
            }
        }
    }
}
