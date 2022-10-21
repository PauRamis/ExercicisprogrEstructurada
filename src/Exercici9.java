import java.util.Scanner;

public class Exercici9 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula el màxim comú divisor de dos números.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Num 1");
        int num1 = scanner.nextInt();
        System.out.println("Num 2");
        int num2 = scanner.nextInt();

        //hem de saber quin es el gran i quin el petit
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        //Temp es una variable per no perdre variables en les operacions
        int temp = 0;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("EL MCD és: " + a);
    }
}
