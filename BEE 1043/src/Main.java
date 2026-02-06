import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double A,B,C;
        try {
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
       
       String resposta = ((A+B>C) && (A+C>B) && (C+B>A))?"Perimetro = "+(A+B+C):"Area = "+(((A + B) * C) / 2.0);

       System.out.println(resposta);
       sc.close(); 
       }catch (Exception e) {
        System.err.println("Tipo: " + e.getClass().getName());
        System.out.println("Erros "+e.getMessage());
       }
    }
}
