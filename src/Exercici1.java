public class Exercici1 {
    public static void main(String[] args) {
        System.out.println("Un programa que mostra per pantalla els 100 primers números senars.");
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0){
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}