import java.util.Scanner;

public class Exercici10 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula el factorial d'un nombre. Exemple: 5! = 5*4*3*2*1 = 120");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int resultat = 1;
        while (num > 1){
            resultat = resultat * num;
            num--;
        }
        System.out.println("El resulltat és: " + resultat);
    }
}
