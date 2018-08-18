package exer01;

import java.util.Scanner;
import java.util.Random;

public class buscasequencial {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner tcl = new Scanner(System.in);
        int vetor[] = new int[tcl.nextInt()];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(50);
        }
        System.out.println("Digite o valor do vetor que deseja encontar");
        int c = tcl.nextInt();
        boolean encontrar = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == c) {
                System.out.println("valor encontrado: " + i);
                encontrar = true;
                break;
            }
        }
        if (encontrar == false) {
            System.out.println("Valor não encontrado");
        }
    }
}
