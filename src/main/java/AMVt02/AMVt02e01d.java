package AMVt02;
import java.util.Scanner;
public class AMVt02e01d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca dos números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > 10 && num2 > 10) System.out.print("Ambos números son mayores de 10.");
        else System.out.print("Ambos números no son mayores de 10.");
    }
}
