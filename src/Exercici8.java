import java.util.Scanner;

public class Exercici8 {
    public static void main(String[] args) {
        System.out.println("Programa que donada una hora en format 24h ho passi a format AM/PM.");
        // Exemple: 17:45 → 5:45 PM
        Scanner scanner = new Scanner(System.in);
        int hora = scanner.nextInt();
        int minuts = scanner.nextInt();

        if (hora > 24) System.out.println("Hora invalida");
        if (hora >= 12) {
            hora =- 12;
            System.out.println(hora+":"+minuts+"PM");
        }
        System.out.println(hora+":"+minuts+"AM");
    }
}
