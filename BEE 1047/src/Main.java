
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner  sc = new Scanner(System.in);
        int horaInicial , minutoInicial, horaFinal , minutoFinal ;
        int inicioHora, finalHora;
        
        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal   = sc.nextInt();
        minutoFinal = sc.nextInt();

        inicioHora = (horaInicial * 60) + minutoInicial;
        finalHora = (horaFinal * 60) + minutoFinal;

        int duracaotoralMinutos = finalHora - inicioHora;
        
        if (duracaotoralMinutos <=0 ) {
            duracaotoralMinutos += 1440;
            
        }


        int duracaoHoras = duracaotoralMinutos / 60;
        int duracaoMinutos =  duracaotoralMinutos % 60;

        System.out.println("O JOGO DUROU "+duracaoHoras+" HORA(S) E "+duracaoMinutos+" MINUTO(S)");
        
        sc.close();
    }

}
