package AMVt02;
import java.util.Scanner;
public class AMVt02e01J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos números: ");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int mayor = Math.max(n, n2);
        int menor = Math.min(n, n2);
        if (n2 != 0 && mayor%menor == 0) System.out.println(menor + " es múltiplo de " + mayor);
        else System.out.println(menor + " no es múltiplo de " + mayor);
    }
}
