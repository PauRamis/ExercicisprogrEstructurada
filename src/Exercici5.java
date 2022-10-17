import java.util.Scanner;

public class Exercici5 {
    public static void main(String[] args) {
        System.out.println("Programa que suma els primers 40 números primers.");
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int count = 40;
        boolean prim = false;
        while (count >= 0) {
            prim = true;
            num++;
            for (int i = 2; i <= num - 1; ++i) {
                if (num % i == 0) {
                    //No es un nombre primer
                    prim = false;
                    break;
                }
            }
            if (prim == true) {
                System.out.println(num);
                count--;
            }

        }
    }
}
