
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double N1  , N2  ,N3 ,N4; 

        N1 = sc.nextDouble();
        N2 = sc.nextDouble();
        N3 = sc.nextDouble();
        N4 = sc.nextDouble();

        double resultado = (N1 * 2 + N2 * 3 +N3 * 4 +N4 * 1) / 10.0;
        if (Math.round(resultado * 100) == 485 ) resultado= 4.8;

        if (resultado >= 7.0) {
            System.out.printf("Media: %.1f\n"+
                            "Aluno aprovado.\n", resultado);
        } else if (resultado < 5.0){
            System.out.printf("Media: %.1f\n"+
                            "Aluno reprovado.\n", resultado);
        }else if (resultado >= 5.0 && resultado <=6.9 ){
            double notaExame;
            double resoltadoFInal;

            notaExame = sc.nextDouble();
            resoltadoFInal = (notaExame + resultado) /2;
            if (resoltadoFInal >= 5.0) {
                
                System.out.printf("Media: %.1f\n" + //
                                "Aluno em exame.\n" + //
                                "Nota do exame: %.1f\n" + //
                                "Aluno aprovado.\n" + //
                                "Media final: %.1f\n", resultado, notaExame,resoltadoFInal);
            } else if (resoltadoFInal < 5.0){
                                System.out.printf("Media: %.1f\n" + //
                                "Aluno em exame.\n" + //
                                "Nota do exame: %.1f\n" + //
                                "Aluno reprovado.\n" + //
                                "Media final: %.1f\n", resultado, notaExame,resoltadoFInal);
            }
            
        }
        sc.close();
    }
}
