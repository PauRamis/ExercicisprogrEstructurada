import java.util.Scanner;

public class Exercici11 {
    public static void main(String[] args) {
        System.out.println("Programa que, donats un mes i un dia, ens diu a quina estació estem");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Esteim al mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.println("Esteim al dia (1-31): ");
        int dia = scanner.nextInt();

        if ((dia >= 20 && mes == 3) || (mes == 4 || mes == 5) || (dia < 21 && mes == 6)){
            System.out.println("Esteim a primavera");
        }
        if ((dia >= 21 && mes == 6) ||  (mes == 7 || mes == 8) || (dia < 23 && mes == 9)){
            System.out.println("Esteim a estiu");
        }
        if ((dia >= 23 && mes == 9) ||  (mes == 10 || mes == 11) || (dia < 21 && mes == 12)){
            System.out.println("Esteim a tardor");
        }
        if ((dia >= 21 && mes == 12) ||  (mes == 1 || mes == 2) || (dia < 20 && mes == 3)){
            System.out.println("Esteim a hivern");
        }
        //Petit control d'errors
        if (mes > 12 || mes < 1)
            System.out.println("mes incorrecte");
        if (dia > 31 || dia < 1)
            System.out.println("dia incorrecte");
    }
}
