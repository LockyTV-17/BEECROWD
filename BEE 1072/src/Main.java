import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int in = 0, out =0;
        int[] valorArray = new int[valor];

        for (int i = 0; i < valor; i++) {
            valorArray[i] = sc.nextInt();
        }
        
        for (var valorcontado : valorArray) {
            if (valorcontado >= 10 && valorcontado <= 20 ) {
                 in ++;
            } else{
                out ++;
            } 
             
        }
        System.out.printf("%d in\n" +
                        "%d out\n", in,out);

        sc.close();
    }
}
