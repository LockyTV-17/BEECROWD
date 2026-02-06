
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println(testePaImPosNeg());
    }

    static String testePaImPosNeg() {
        int par = 0, imp = 0, neg = 0, pos = 0, valor;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            valor = scanner.nextInt();
            if ((valor < 0) && (valor % 2 == 0)) {
                neg++;
                par++;
            } else if ((valor > 0) && !(valor % 2 == 0)) {
                pos++;
                imp++;
            } else if ((valor < 0) && !(valor % 2 == 0)) {
                neg++;
                imp++;
            } else if ((valor > 0) && (valor % 2 == 0)) {
                pos++;
                par++;
            } else if (valor == 0) {
                par++;

            }
        }
        scanner.close();
         return par + " valor(es) par(es)\n"
                + imp + " valor(es) impar(es)\n"
                + pos + " valor(es) positivo(s)\n"
                + neg + " valor(es) negativo(s)";
    }
}
