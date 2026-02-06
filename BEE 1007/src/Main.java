
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int  A, B, C, D ;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        int E = caculaValor(A, B, C,D);

        System.out.printf("DIFERENCA = %d\n",E);
    } 

    static int caculaValor(int A,int B,int C,int D){   
        int E = (A * B - C * D);

    return E;
    }
}
