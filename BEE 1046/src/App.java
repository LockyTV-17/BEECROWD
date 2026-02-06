
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TempoDeJogo tempodejogo = new TempoDeJogo();

         String teste =tempodejogo.toltalJohado(sc);
         System.out.println(teste);
    }
}
