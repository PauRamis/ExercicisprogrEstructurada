import java.util.Scanner;

public class Exercici12 {
    public static void main(String[] args) {
        System.out.println("Programa que, donada la data de naixament, ens mostri el signe del zodíac corresponent");
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Esteim al mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.println("Esteim al dia (1-31): ");
        int dia = scanner.nextInt();

        if ((dia >= 21 && mes == 3) ||  (dia < 19 && mes == 4)){
            System.out.println("Aries");
        }
        if ((dia >= 20 && mes == 4) || (dia < 20 && mes == 5)){
            System.out.println("Tauro");
        }
        if ((dia >= 21 && mes == 5) || (dia < 20 && mes == 6)){
            System.out.println("Géminis");
        }
        if ((dia >= 21 && mes == 6) || (dia < 22 && mes == 7)){
            System.out.println("Cáncer");
        }
        if ((dia >= 23 && mes == 7) || (dia < 22 && mes == 8)){
            System.out.println("Leo");
        }
        if ((dia >= 23 && mes == 8) || (dia < 22 && mes == 9)){
            System.out.println("Virgo");
        }
        if ((dia >= 23 && mes == 9) || (dia < 22 && mes == 10)){
            System.out.println("Libra");
        }
        if ((dia >= 23 && mes == 10) || (dia < 21 && mes == 11)){
            System.out.println("Escorpio");
        }
        if ((dia >= 22 && mes == 11) || (dia < 21 && mes == 12)){
            System.out.println("Sagitario");
        }
        if ((dia >= 22 && mes == 12) || (dia < 19 && mes == 1)){
            System.out.println("Capricornio");
        }
        if ((dia >= 20 && mes == 1) || (dia < 18 && mes == 2)){
            System.out.println("Acuario");
        }
        if ((dia >= 19 && mes == 2) || (dia < 20 && mes == 3)){
            System.out.println("Piscis");
        }
        //Petit control d'errors
        if (mes > 12 || mes < 1)
            System.out.println("mes incorrecte");
        if (dia > 31 || dia < 1)
            System.out.println("dia incorrecte");
    }
}
