
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int entradateste, divisor;
        List<Integer> palavras = new ArrayList<>();
        double caculo = 0, media;        
        
        
        
        while(true){
            entradateste = sc.nextInt();
            if (entradateste > 0) {
                palavras.add(entradateste);
            }else{
                break;
            }
        }

        for (Integer somaPlavras : palavras) {
            caculo += somaPlavras;
        }

        media = caculo / palavras.size();

        System.out.printf("%.2f",media);
    }   
}
