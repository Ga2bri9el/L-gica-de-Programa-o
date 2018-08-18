package exer01;

import java.util.Scanner;

public class bubblesort {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int vetor[] = new int[5];
        int aux = 0;
        System.out.println("Vetor desordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;

                }

            }

        }
        System.out.println("Vetor organizado: ");
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println(vetor[i]);
                }
    }
}
