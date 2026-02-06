
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        sortSimples();

    }

    static void sortSimples(){
        Scanner scanner = new Scanner(System.in);
        int[] numerosRecebidos = new int[3];

        for (int i = 0; i <= 2; i++) {
            numerosRecebidos[i] = scanner.nextInt();
        }
        
        String gardar = numerosRecebidos[0] +"\n"+ numerosRecebidos[1]+"\n"+ numerosRecebidos[2];

        Arrays.sort(numerosRecebidos);

        for (int numerosRecebido : numerosRecebidos) {
            System.out.println(numerosRecebido);
        }

        System.out.printf("\n"+gardar);

    }
}
