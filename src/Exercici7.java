import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercici7 {
    public static void main(String[] args) {
        System.out.println("Programa que soluciona una equació de segon grau. (Ax2 + Bx + C = 0)");
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        //Formula per resoldre les equacions de segon grau.
        double resol1 = (-B - sqrt(B*B - 4 * A * C)) / 2 * A;
        double resol2 = (-B + sqrt(B*B - 4 * A * C)) / 2 * A;

        System.out.println("X = "+resol1+" o "+resol2);
    }
}
