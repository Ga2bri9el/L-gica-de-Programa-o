import java.util.Scanner;
public class terceira {
    public static void main(String[] args){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite a distância(Km)");
        double dt = tcl.nextInt();
        System.out.println("Digite o combustivel gasto(L)");
        double cg = tcl.nextInt();
        double cons = dt/cg;
        System.out.println("O consumo é " + cons + " km/L");
    }
}
