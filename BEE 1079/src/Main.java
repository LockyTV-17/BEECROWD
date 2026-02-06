import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);
        int valorUM, valorDois;

        valorUM = Scanner.nextInt();
        valorDois = Scanner.nextInt();

        String resultado = multiplos(valorUM, valorDois);
        System.out.println(resultado);

    }
    static String multiplos(int valorUM, int valorDois){
        String resultado = (valorUM % valorDois == 0 || valorDois % valorUM == 0)? "Sao Multiplos":"Nao sao Multiplos";
        return resultado;
    }
    
}