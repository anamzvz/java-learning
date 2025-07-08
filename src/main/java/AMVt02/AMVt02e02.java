package AMVt02;
import java.util.Scanner;
public class AMVt02e02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tres números: ");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n<0 && n2<0 && n3<0) System.out.print(n*n2*n3);
        else if (n>=0 && n2>=0 && n3>=0) System.out.print((n+n2)*n3);
        else if (n<0 || n2<0 || n3<0) System.out.print(n+n2+n3);
        else System.out.print("No se ha podido realizar el cálculo.");
        {

        }


    }
}
