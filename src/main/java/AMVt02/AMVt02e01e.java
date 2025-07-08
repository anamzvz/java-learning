package AMVt02;
import java.util.Scanner;
public class AMVt02e01e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos números ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > 10 || num2 > 10) System.out.print("Al menos uno de los números es mayor de 10.");
        else System.out.print("Ninguno de los números es mayor de 10.");
    }
}
