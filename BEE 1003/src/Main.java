
import java.util.Scanner;



public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A,B;

        A = sc.nextInt();
        B = sc.nextInt();
         int C = caculaValor(A,B);

        System.out.println("SOMA = "+C);
    } 

    static int caculaValor(int A,int B){   
        int C = A+B;

    return C;
    }
}
