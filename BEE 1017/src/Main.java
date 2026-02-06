
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int tempo = 0;
        double km = 0d;

        tempo = sc.nextInt();

        km = sc.nextDouble();

        double gasto = gastoCombustivel(tempo, km);

        System.out.printf("%.3f\n",gasto);
    }

    public static double gastoCombustivel(int tempo, double km){
        double gasto =  km/12 * tempo;

        return gasto;
    }
}
