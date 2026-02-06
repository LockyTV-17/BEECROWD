import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        
        String rsultadom = caculartriangulo(A,B,C);

        System.out.print(rsultadom);
        
    }

    static String caculartriangulo(double A,double B,double C){
        
        double area  = (A*C)/2 ;
        double círculoderaio = 3.14159 * Math.pow(C, 2);
        double areaTrapezio = ((A+B)* C)/ 2;
        double areadoQuadrado = Math.pow(B, 2);
        double areadoRetângulo = A * B;

        return String.format(
            "TRIANGULO: %.3f\n"+
            "CIRCULO: %.3f\n" +
            "TRAPEZIO: %.3f\n" +
            "QUADRADO: %.3f\n" +
            "RETANGULO: %.3f\n",area, círculoderaio, areaTrapezio, areadoQuadrado, areadoRetângulo);


    }
}
