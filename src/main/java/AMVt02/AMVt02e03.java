package AMVt02;
import java.util.Scanner;
public class AMVt02e03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la nota del examen: ");
        int examen = sc.nextInt();
        System.out.print("Introduzca la nota del trabajo de clase: ");
        int clase = sc.nextInt();
        System.out.print("Introduzca la nota del trabajo práctico: ");
        int practico = sc.nextInt();
  if (examen>5 || (4<examen<5 && clase>5 && practico>5) || (4<examen<5 && (clase>8 || practico>8)); System.out.print("Está Vd. aprobado.");
  else System.out.print("No pasa Vd. la asignatura.");
    }
}
