
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int valores;
        int ePar = 0;
        
        for (int i = 0; i < 5; ++i) {
            valores = sc.nextInt();
            ePar = (valores % 2 == 0)? ePar+1:+0;
        }

        System.out.printf("%d valores pares%n",ePar);
        sc.close();


    }
}
