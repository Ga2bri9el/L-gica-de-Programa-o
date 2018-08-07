import java.util.Scanner;
public class segundadois {
    public static void main(String[] args){
         System.out.println("Digite o ano atual");
        Scanner tcl = new Scanner(System.in);
        int a = tcl.nextInt();
        System.out.println("digite sua data de nascimento");
        int b = tcl.nextInt();
        int ida = a-b;
        System.out.print("Sua idade é "+ida);
    }
}
