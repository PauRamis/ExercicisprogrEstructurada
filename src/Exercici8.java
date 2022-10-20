import java.util.Scanner;

public class Exercici8 {
    public static void main(String[] args) {
        System.out.println("Programa que donada una hora en format 24h ho passi a format AM/PM.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hora: ");
        int hora = scanner.nextInt();
        System.out.println("Minuts: ");
        int minuts = scanner.nextInt();

        if (hora > 24 || minuts > 60) System.out.println("Hora invalida");
        else if (hora >= 12) {
            hora = hora - 12;
            System.out.println(hora+":"+minuts+"PM");
        } else
        System.out.println(hora+":"+minuts+"AM");
    }
}
