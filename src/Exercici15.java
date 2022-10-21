public class Exercici15 {
    public static void main(String[] args) {
        //Quantes vegades s'executa el següent bucle?
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i < 10)
                continue;
            i++;
            if (i == 10)
                break;
        }
        //El bucle s'executa 10 vegades, fins que i deixa de ser més petit que 10,
        // pero no executa el i==10, perque antes hi ha un i++ que fa que i sigui 11.
        //Supos que el programa es cancela en aquest moment perque no pot fer res més.
    }
}
