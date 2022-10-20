public class Exercici6 {
    public static void main(String[] args) {
        System.out.println("Programa que mostra els primers 30 múltiples de 5 que no són múltiples de 3.");
        int cont = 0;
        for (int i = 5; cont < 30; i += 5) {
            if (i % 3 != 0) {
                System.out.println(i);
                cont++;
            }
        }
    }
}
