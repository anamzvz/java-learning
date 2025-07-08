package AMVt01;

import java.util.Scanner;

class AMVt1e05_2 {
    public static void main(String[] args) {
        double agua_pul;
        double agua_ml;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el valor de agua del pluviómetro en pulgadas: ");
        agua_pul = input.nextDouble();
        agua_ml = Math.round((agua_pul * 0.1)*100.00)/100.0;
        System.out.println("Agua en mL: " +agua_ml);

    }
}
