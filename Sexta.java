import java.util.Scanner;
public class Sexta {
    public static void main(String[] args){
            Scanner tcl = new Scanner(System.in);
            System.out.println("Digite o valor da compra(R$)");
            double a = tcl.nextDouble();
            double b = a/5;
            System.out.println("O valor das parcelas são "+ b);
}
}
