import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        System.out.println("programa que converteix una temperatura en graus Celsius a Farenheit.");
        System.out.println("Introdueix la tempreatura en celsius");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double farenheit = (celsius*1.8)+32;
        System.out.println("La temperatura en farenheit és: " + farenheit);
    }
}
