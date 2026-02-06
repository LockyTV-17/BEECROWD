
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A, B;
        double salary;

        A = sc.nextInt();
        B = sc.nextInt();
        salary = sc.nextDouble();
        caculaValor(A, B, salary);

    }

    static void caculaValor(int A, int B, double salary) {

        salary = salary * B;
        System.out.printf("""
                NUMBER = %d
                SALARY = U$ %.2f
                """, A, salary);

    }
}
