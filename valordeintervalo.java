package exer01;

import java.util.Scanner;

public class valordeintervalo {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int a = tcl.nextInt();
        int b = tcl.nextInt();
        for (int i = a + 1; i < b; i++) {
            System.out.println(i);
        }
    }
}
