package AMVt02;
import java.util.Scanner;

public class AMVt02e01b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) System.out.println("El primer número es mayor que el segundo.");
        else System.out.print("El primer número no es mayor.");

    }
}
