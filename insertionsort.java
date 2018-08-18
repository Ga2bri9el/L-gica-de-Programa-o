
package exer01;

import java.util.Scanner;

public class insertionsort {
  public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }
        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i;
            while ((j > 0) && (vetor[j - 1] > aux)) {
                vetor[j] = vetor[j - 1];
                j -= 1;
            }
            vetor[j] = aux;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}

    

