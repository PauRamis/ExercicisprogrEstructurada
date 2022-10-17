import java.util.concurrent.TimeUnit;
public class Exercici3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Programa que mostra per pantalla la successió de números 2, 4, 8, 16, 32...");
        int num = 1;
        while (true){
            num = num*2;
            System.out.println(num);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
