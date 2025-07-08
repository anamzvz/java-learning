package AMVt01;
import java.util.Scanner;

public class AMVt01e08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e1, e2, e3, e4;
        double sol;
        System.out.println("Introduce la edad del primer individuo:");
        e1 = sc.nextInt();
        System.out.println("Introduce la edad del segundo individuo:");
        e2 = sc.nextInt();
        System.out.println("Introduce la edad del tercer individuo:");
        e3 = sc.nextInt();
        System.out.println("Introduce la edad del cuarto individuo:");
        e4 = sc.nextInt();
        sol = (double)(e1+e2+e3+e4)/4;
        System.out.println("La edad media de los individuos es " + sol);

    }
}

// para usarlo solo con uno, hay que definir la variable solución y en cada edad que se añada, sumarla y luego dividir esa variable entre 4