import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        a = (a + b + Math.abs(a-b))/ 2 ;

        int result = (a + c + Math.abs(a-c))/ 2;
        
        System.out.println(result+" eh o maior");
        sc.close();
    }
}
