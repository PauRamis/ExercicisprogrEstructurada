public class Exercici15 {
    public static void main(String[] args) {
        //Quantes vegades s'executa el següent bucle?
        int i = 0;
        while (true) {
            i++;
            if (i < 10)
                continue;
            i++;
            if (i == 10)
                break;
        }
        //El bucle s'executa 5 vegades, fins que i == 10 i fá un break del bucle infinit.
    }
}
S