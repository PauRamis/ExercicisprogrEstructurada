import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
        System.out.println("Programa que imprimeix per pantalla la taula de multiplicar d'un nombre.");
        System.out.println("De quin numero vols la taula?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num*i);
        }
    }
}
