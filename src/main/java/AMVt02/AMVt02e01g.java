package AMVt02;
import java.util.Scanner;
public class AMVt02e01g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos números: ");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        if (n == 10 || n2 == 10) System.out.print("Uno de los números es 10.");
        else System.out.print("Ninguno de los números es 10.");
    }
}
