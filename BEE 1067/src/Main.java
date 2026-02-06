
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero = 1;

        numero = sc.nextInt();
        for (int i = 0; i <= numero ; i++) {
            
            
            if (i % 2 != 0 ) {
                System.out.printf("%d%n",i);
            }
            
        }
    }
}
