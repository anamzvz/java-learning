package AMVt02;
import java.util.Scanner;

public class AMVt02e01c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean par;
        System.out.println("Introduce un número y te diré si es par: ");
        int num = sc.nextInt();

        par = (num % 2 == 0);
        if (par) System.out.println("El número introducido es par.");
        else System.out.print("El número es impar.");
    }
}
