package AMVt02;
import java.util.Scanner;
public class AMVt02e01f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza un número: ");
        int n = sc.nextInt();
        if (n >= 10 && n <= 20) System.out.println("El número introducido se encuentra entre 10 y 20.");
        else System.out.print("El número introducido es menor que 10 o mayor que 20.");
    }
}
