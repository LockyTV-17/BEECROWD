
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double A,B;

        A = sc.nextDouble();
        B = sc.nextDouble();
        double C = caculaValor(A,B);

        System.out.printf("MEDIA = %.5f\n",C);

        sc.close();
    } 

    static double caculaValor(double A,double B){   

        A = A*3.5;
        B = B*7.5;
        double C = (A+B)/11;

    return C;
    }
}
