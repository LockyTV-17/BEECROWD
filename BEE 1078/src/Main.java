
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        tabuada();
    }

    static void tabuada() {
        int valor = 1, resultado = 0;
        Scanner scanner = new Scanner(System.in);
        valor = scanner.nextInt();
        if (2 < valor && valor < 1000) {
            for (int i = 0; i <= 10; i++) {
                resultado = i * valor;
                System.out.printf("%d x %d = %d%n", i, valor, resultado);
            }
        }
        scanner.close();
    }
}
