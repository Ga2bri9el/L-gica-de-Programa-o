import java.util.Scanner;
public class quarta {
    public static void main(String[] args){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor");
        String a = tcl.nextLine();
        System.out.println("Digite o seu salário fixo");
        double b = tcl.nextInt();
        System.out.println("Digite o seu total de vendas efetuadas no mês(R$)");
        double c = tcl.nextInt();
        double Sc = c*0.15;
        double Sf = b+Sc;
        System.out.println(a + " tem um salário fixo de " + b + " e um salário final no mês de "+ Sf);
    }
}
