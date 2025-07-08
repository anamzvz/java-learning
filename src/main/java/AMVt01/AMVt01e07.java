package AMVt01;

import java.util.Currency;
import java.util.Scanner;

public class AMVt01e07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km1, km2, litro1, litro2, sol;
        System.out.println("¿Cuál era el kilometraje la última vez que repostó?");
        km1 = sc.nextDouble();
        System.out.println("¿Cuál es el kilometraje actual?");
        km2 = sc.nextDouble();
        System.out.println("¿Cuántos litros de gasolina tenías la última vez que se repostó?");
        litro1 = sc.nextDouble();
        System.out.println("¿Cuántos tiene ahora?");
        litro2 = sc.nextDouble();
        sol = ((litro1 - litro2)*100)/(km2-km1);
        System.out.println("El consumo del coche cada 100km es de " + sol + " litros.");
    }
}
