import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] valor = new int[6];
        int positivo = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um valor");
            valor[i] = sc.nextInt();
            if (valor[i] > 0) {
                positivo++;
            }
        }

        System.out.printf("%d valores positivos%n", positivo);
        sc.close();
    }
}
