package AMVt02;
import java.util.Scanner;
public class AMVt02e01h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca dos números: ");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        if (n > n2) System.out.print(n +" es mayor que " + n2);
        if (n2 > n) System.out.print(n2 +" es mayor que " + n);
        if (n2 == n) System.out.print(n + " y " + n2 + " tienen el mismo valor.");
    }
}
