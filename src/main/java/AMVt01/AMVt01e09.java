package AMVt01;

import java.util.Scanner;

public class AMVt01e09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1, var2, temp;
        System.out.println("Introduce var1:");
        var1 = sc.nextInt();
        System.out.println("Introduce var2:");
        var2 = sc.nextInt();
        temp = var1;
        var1 = var2;
        var2 = temp;
        System.out.println("Ahora var1 es igual a " + var1);
        System.out.println("Ahora var2 es igual a "+ var2);
    }
}
