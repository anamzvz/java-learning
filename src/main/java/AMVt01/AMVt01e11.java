package AMVt01;

import java.util.Scanner;

public class AMVt01e11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cat1, cat2, hip;
        System.out.println("Introduce el valor del cateto 1:");
        cat1 = sc.nextDouble();
        System.out.println("Introduce el valor del cateto 2:");
        cat2 = sc.nextDouble();
        hip = Math.sqrt (Math.pow(cat1, 2) + Math.pow(cat2, 2));
        System.out.println("El valor del hip es: " + hip);
    }
}
