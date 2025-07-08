package AMVt02;
import java.util.Scanner;
public class AMVt02e01I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos números: ");
        int num = sc.nextInt();
        int div = sc.nextInt();
        if (div != 0 && num%div == 0) System.out.println(div + "es divisor de " + num);
        else System.out.println(div + " no es divisor de " + num);

    }
}
