import java.util.Scanner;
public class Quinta {
    public static void main(String[] args){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        double a = tcl.nextDouble();
        double F = ((9*a)+160)/5;
        System.out.println("A temperatura em Fahrenheit é " + F);
    }
}
