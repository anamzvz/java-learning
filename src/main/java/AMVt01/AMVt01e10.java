package AMVt01;

import java.util.Scanner;

public class AMVt01e10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sol;
        System.out.println("Introduce X:");
        x = sc.nextInt();
        System.out.println("Introduce Y:");
        y = sc.nextInt();
        sol = Math.abs(x*y);
        System.out.println("La base del rectángulo en el plano es " + sol);
    }
}
