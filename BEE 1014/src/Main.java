
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Integer km ;
        double litros;

        km  = sc.nextInt();
        litros = sc.nextDouble();
        double kmsPercorricos = km / litros;

        System.out.printf("%.3f km/l\n",kmsPercorricos);
    }
}
