
import java.util.Scanner;

public class TempoDeJogo {

    public int horaInical;
    public int horaFInal ;
    public int horaJogadas;

    public String toltalJohado(Scanner sc) {
        horaInical = sc.nextInt();
        horaFInal = sc.nextInt();
        if (horaInical > horaFInal) {
            for (int j = horaInical; j < 24; j++) {
                horaJogadas++;
            }
            return "O JOGO DUROU " + (horaJogadas + horaFInal) + " HORA(S)";
        } else if (horaInical== horaFInal) {
            return "O JOGO DUROU 24 HORA(S)";
        } else {
            for (int i = horaInical; i < horaFInal; i++) {
                ++horaJogadas;
            }
            return "O JOGO DUROU " + horaJogadas + " HORA(S)";
        }
    }
}
