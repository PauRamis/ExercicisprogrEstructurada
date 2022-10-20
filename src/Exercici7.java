import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercici7 {
    public static void main(String[] args) {
        System.out.println("Programa que soluciona una equació de segon grau. (Ax2 + Bx + C = 0)");
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double discr = B*B - 4 * A * C;
        if (discr < 0){
            System.out.println("No te resultat");
            return;
        }
        if (discr == 0){
            double sol = -B / (2*A);
            System.out.println("hi ha una solució: " + sol);
        }

        //Formula per resoldre les equacions de segon grau.
        double resol1 = (-B - sqrt(discr)) / (2*A);
        double resol2 = (-B + sqrt(discr)) / (2*A);

        System.out.println("Les dues solucions són: "+resol1+" i "+resol2);
    }
}
