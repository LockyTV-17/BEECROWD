
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        double y1,y2,x1,x2;

         x1 = leitor.nextDouble();
         y1 = leitor.nextDouble();
         x2 = leitor.nextDouble();
         y2 = leitor.nextDouble();
        
        double distancia =  Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.printf("%4f\n", distancia);
    }
}
