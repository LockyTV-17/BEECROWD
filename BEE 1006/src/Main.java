
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double A,B,C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        double D = caculaValor(A,B,C);

        System.out.printf("MEDIA = %.1f\n",D);
    } 

    static double caculaValor(double A,double B,double C){   

        A = A*2;
        B = B*3;
        C = C*5;
        double D = (A+B+C)/10;

    return D;
    }
}
