package AMVt01;

import java.util.Scanner;

public class AMVt1e05 {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la temperatura en Celsius: ");
        celsius = sc.nextDouble();
        fahrenheit = Math.round(((celsius * 9/5) + 32)*100.0)/100.0;
        System.out.println("La temperatura es " + fahrenheit+ "ºF");

    }
}
