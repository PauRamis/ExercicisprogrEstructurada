public class Exercici6 {
    public static void main(String[] args) {
        System.out.println("Programa que mostra els primers 30 múltiples de 5 que no són múltiples de 3.");
        int cont = 0;
        for (int i = 0; cont < 30; i++) {
            if (i % 5 == 0){
                if (i % 3 == 0){
                    //Es mmultiple de 3
                    continue;
                } else {
                    System.out.println(i);
                    cont++;
                }
            }

        }
    }
}
