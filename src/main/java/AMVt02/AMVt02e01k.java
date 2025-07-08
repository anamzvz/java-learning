package AMVt02;
import java.util.Scanner;
public class AMVt02e01k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        if (n%2 == 0) System.out.print(n + " es múltiplo de 2.");
        else if (n%3 == 0) System.out.print (n + "es múltiplo de 3.");
        else if (n%10 == 0) System.out.print(n + "es múltiplo de 10.");
        else System.out.print(n + " no es múltiplo de 2, 3 ni 10.");

    }
}
