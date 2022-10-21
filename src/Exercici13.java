import java.util.Scanner;

public class Exercici13 {
    public static void main(String[] args) {
        System.out.println("Programa que, donada una nota d'un alumne (de 0 a 10), ens diu si aquesta és «Excel·lent»,\n" +
                "«Notable», «Bé», «Suficient» o «Insuficient».");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nota: ");
        int nota = scanner.nextInt();
        if (nota < 0)
            System.out.println("Nota no valida, minim 0");
        else if (nota < 5)
            System.out.println("Insuficient");
        else if (nota < 7)
            System.out.println("Suficient");
        else if (nota < 9)
            System.out.println("Notable");
        else if (nota <= 10)
            System.out.println("Excel·lent");
        else System.out.println("Nota no valida, maxim 10");
        //Suposam que no pot haver-hi una nota negativa o major a 10.
    }
}
