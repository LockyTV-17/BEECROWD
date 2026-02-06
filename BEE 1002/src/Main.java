
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double entrada;

        entrada = sc.nextDouble();

        double C = caculaValor(entrada);

        System.out.printf("A=%.4f\n",C);
    }

    static double caculaValor(double entrada) {
        double area, n = 3.14159;
        area = n * Math.pow(entrada, 2);

        return area;
    }
}

