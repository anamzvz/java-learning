package AMVt01;

import java.util.Scanner;

public class AMVt1e06 {
    public static void main(String[] args) {
        double costefab;
        double costetienda;
        double impuesto;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el coste de fábrica de su vehículo: ");
        costefab = input.nextDouble();
        costetienda = costefab * 0.1;
        impuesto = costefab * 0.2;
        costefab = costefab + costetienda + impuesto;
        System.out.println("El coste final de su coche será de " + costefab + "€");

    }
}
