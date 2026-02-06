import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    

       
    double valorAPagar = calcularPeca();
    
    System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorAPagar);
    }
    
    static double  calcularPeca(){

    List<Double> pecaUm = new ArrayList<>(3);
    List<Double> pecaDois = new ArrayList<>(); 
    
        for (int i = 0; i < 3; i++) {
            pecaUm.add(sc.nextDouble());
        }

        for (int i = 0; i < 3; i++) {
        pecaDois.add(sc.nextDouble());
        }

        double valorAPagar = (pecaUm.get(1)*pecaUm.get(2)) + (pecaDois.get(1)*pecaDois.get(2));
    return valorAPagar;
    }
}
