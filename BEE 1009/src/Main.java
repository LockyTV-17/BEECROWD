import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome;
        double salario, totalDeVendas;

        nome  = sc.nextLine(); 
        salario = sc.nextDouble();
        totalDeVendas = sc.nextDouble();
        
        double totalsalario = cacularComissao(salario,  totalDeVendas);

        System.out.printf("TOTAL =%2.f\n",totalsalario);
    }

    static double cacularComissao(double salario,  double totalDeVendas){
        double comissao;
        comissao = salario +(totalDeVendas % 15);
        return comissao;
    }
}
