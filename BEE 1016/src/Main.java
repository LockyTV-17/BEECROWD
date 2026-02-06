
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        km = quilometrosrodados(km);

        System.out.printf( "%s minutos\n",km);
    }

    public static int quilometrosrodados(int km) {
        int minutos;

        minutos = km * 2;

        return minutos;
    }
}
