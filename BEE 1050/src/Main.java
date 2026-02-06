import java.util.Scanner;





public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DD;
        String estado;

        DD = sc.nextInt();
        
        
       estado = switch (DD) {
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            case 11 ->"Sao Paulo";
            case 21 -> "Rio de Janeiro";
            case 32 -> "Juiz de Fora";
            case 19 -> "Campinas";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte";
            default->"DDD nao cadastrado";

        };
        System.out.println(estado);

    }
}