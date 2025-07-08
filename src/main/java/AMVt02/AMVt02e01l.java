package AMVt02;
import java.util.Scanner;
public class AMVt02e01l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tres números: ");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n > 0 || n2 > 0 || n3 > 0) System.out.print("Al menos uno de los números es mayor que 0.");
        else System.out.print("Ninguno de los números es mayor que 0.");
    }
}
