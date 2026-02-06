import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double trianguloA =0 , trianguloB = 0, trianguloC = 0;
        double[] nomeArray = new double[3];
        String resposta;

        for (int i = 0; i < 3; i++) {
            nomeArray[i] = sc.nextDouble();
        }

            Arrays.sort(nomeArray);
            trianguloA = nomeArray[2];
            trianguloB = nomeArray[1];
            trianguloC = nomeArray[0];
      

       resposta = tiposDeTriangulos(trianguloA,trianguloB,trianguloC);
       System.out.printf(resposta); 
    }



    static public String  tiposDeTriangulos(double trianguloA, double trianguloB,double trianguloC){
        String respontaUm="", respontaDois="";

        if (trianguloA >= (trianguloB + trianguloC)) {
            respontaUm = "NAO FORMA TRIANGULO";
            return respontaUm+"\n";
        }else if(Math.pow(trianguloA, 2) == (Math.pow(trianguloB, 2) + Math.pow(trianguloC, 2))) {
            respontaUm = "TRIANGULO RETANGULO";
        }else if(Math.pow(trianguloA, 2) > (Math.pow(trianguloB, 2) + Math.pow(trianguloC, 2))) {
            respontaUm = "TRIANGULO OBTUSANGULO";
        }else if(Math.pow(trianguloA, 2) < (Math.pow(trianguloB, 2) + Math.pow(trianguloC, 2))) {
            respontaUm = "TRIANGULO ACUTANGULO";
        }
        
        if(trianguloA == trianguloB && trianguloB == trianguloC){
            respontaDois = "TRIANGULO EQUILATERO";
        }else if(trianguloA == trianguloB || trianguloB == trianguloC || trianguloA == trianguloC){
            respontaDois = "TRIANGULO ISOSCELES";
        }
        
            return respontaUm + "\n" + respontaDois+"\n";
    
    }       
}
