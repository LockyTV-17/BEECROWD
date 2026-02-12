import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        

        int horas = entrada / 3600;
        int minutos = (entrada % 3600) / 60;
        int segundos = entrada % 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        
        sc.close();
    }
}