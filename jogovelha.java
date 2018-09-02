
import java.util.Scanner;

public class jogovelha {

    public static int vitvelha(String[][] matriz, int i, int j, int cont) {
        if ((matriz[0][0] == "X" && matriz[2][2] == "X" && matriz[1][1] == "X") || (matriz[0][0] == "O" && matriz[1][1] == "O" && matriz[2][2] == "O")) {
            System.out.println("Jogo Terminado");
            if (matriz[0][0] == "X") {
                System.out.println("Jogador 1 VENCEDOR!!");
            } else {
                System.out.println("Jogador 2 VENCEDOR!!");
            }
            return 1;
        }
        if ((matriz[0][0] == "X" && matriz[0][1] == "X" && matriz[0][2] == "X") || (matriz[0][0] == "O" && matriz[0][1] == "O" && matriz[0][2] == "O")) {
            System.out.println("Jogo Terminado");
            if (matriz[0][0] == "X") {
                System.out.println("Jogador 1 VENCEDOR!!");
            } else {
                System.out.println("Jogador 2 VENCEDOR!!");
            }
            return 1;
        }
        if ((matriz[1][0] == "X" && matriz[1][1] == "X" && matriz[1][2] == "X") || (matriz[1][0] == "O" && matriz[1][1] == "O" && matriz[1][2] == "O")) {
            System.out.println("Jogo Terminado");
            if (matriz[1][0] == "X") {
                System.out.println("Jogador 1 VENCEDOR!!");
            } else {
                System.out.println("Jogador 2 VENCEDOR!!");
            }
            return 1;
        }
        if ((matriz[2][0] == "X" && matriz[2][1] == "X" && matriz[2][2] == "X") || (matriz[2][0] == "O" && matriz[2][1] == "O" && matriz[2][2] == "O")) {
            System.out.println("Jogo Terminado");
            if (matriz[2][0] == "X") {
                System.out.println("Jogador 1 VENCEDOR!!");
            } else {
                System.out.println("Jogador 2 VENCEDOR!!");
            }
            return 1;
        }
        if ((matriz[0][0] == "X" && matriz[1][0] == "X" && matriz[2][0] == "X") || (matriz[0][0] == "O" && matriz[1][0] == "O" && matriz[2][0] == "O")) {
            System.out.println("Jogo Terminado");
            if (matriz[0][0] == "X") {
                System.out.println("Jogador 1 VENCEDOR!!");
            } else {
                System.out.println("Jogador 2 VENCEDOR!!");
            }
            return 1;
        }
        if ((matriz[0][1] == "X" && matriz[1][1] == "X" && matriz[2][1] == "X") || (matriz[0][1] == "O" && matriz[1][1] == "O" && matriz[2][1] == "O")) {
            System.out.println("Jogo Terminado");
            if (matriz[0][1] == "X") {
                System.out.println("Jogador 1 VENCEDOR!!");
            } else {
                System.out.println("Jogador 2 VENCEDOR!!");
            }
            return 1;
        }
        if ((matriz[0][2] == "X" && matriz[1][2] == "X" && matriz[2][2] == "X") || (matriz[0][2] == "O" && matriz[1][2] == "O" && matriz[2][2] == "O")) {
            System.out.println("Jogo Terminado");
            if (matriz[0][2] == "X") {
                System.out.println("Jogador 1 VENCEDOR!!");
            } else {
                System.out.println("Jogador 2 VENCEDOR!!");
            }
            return 1;
        }
        if ((matriz[0][2] == "X" && matriz[1][1] == "X" && matriz[2][0] == "X") || (matriz[0][2] == "O" && matriz[1][1] == "O" && matriz[2][0] == "O")) {
            System.out.println("Jogo Terminado");
            if (matriz[0][2] == "X") {
                System.out.println("Jogador 1 VENCEDOR!!");
            } else {
                System.out.println("Jogador 2 VENCEDOR!!");
            }
            return 1;
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (matriz[i][j] == "X" || matriz[i][j] == "O") {
                    cont++;
                }
            }
        }
        if (cont == 9) {
            System.out.println("Deu Velha!!");
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int a, b, l, c, i = 0, j = 0, t, cont;
        String matriz[][] = new String[3][3];
        a = 1;
        b = 0;
        t = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matriz[i][j] = "*";
            }
        }
        while (t == 0) {
            cont = 0;
            if (a == 1) {
                System.out.println("jogador 1,Linha: x Coluna: (Respectivamente)");
                l = tcl.nextInt();
                c = tcl.nextInt();
                if (l > 2 || l < 0 || c > 2 || c < 0 || matriz[l][c] != "*") {
                    System.out.println("Inválido");
                } else {
                    matriz[l][c] = "X";
                    a = 0;
                    b = 1;
                    for (i = 0; i < 3; i++) {
                        for (j = 0; j < 3; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
            }
            t = vitvelha(matriz, i, j, cont);
            if (t == 1) {
                break;
            }
            if (b == 1) {
                System.out.println("jogador 2,Linha: x Coluna: (Respectivamente)");
                l = tcl.nextInt();
                c = tcl.nextInt();
                if (l > 2 || l < 0 || c > 2 || c < 0 || matriz[l][c] != "*") {
                    System.out.println("Inválido");
                } else {
                    matriz[l][c] = "O";
                    a = 1;
                    b = 0;
                    for (i = 0; i < 3; i++) {
                        for (j = 0; j < 3; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
            }
            t = vitvelha(matriz, i, j, cont);
        }
    }
}
