
import java.util.Scanner;

public class segunda {

    public static void main(String[] args) {
        System.out.println("Digite dois valores");
        Scanner tcl = new Scanner(System.in);
        double a = tcl.nextDouble();
        double b = tcl.nextDouble();
        double sub = a - b;
        double mult = a * b;
        double div = a / b;
        System.out.print("A subtração é " + sub + " a multiplicação é " + mult + " e a divisão é " + div);
    }
}
