import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int numero = leitor.nextInt();
        
        System.out.println(numero);

        int nota100div = numero / 100;
        int nota100resto = numero % 100; 

        int nota50div = nota100resto / 50;
        int nota50resto = nota100resto % 50;

        int nota20div = nota50resto / 20;
        int nota20resto = nota50resto % 20;

        int nota10div = nota20resto / 10;
        int nota10resto = nota20resto % 10;

        int nota5div = nota10resto / 5;
        int nota5resto = nota10resto % 5;

        int nota2div = nota5resto / 2;
        int nota2resto = nota5resto % 2;

        int nota1div = nota2resto / 1;

        System.out.println(nota100div + " nota(s) de R$ 100,00");
        System.out.println(nota50div + " nota(s) de R$ 50,00");
        System.out.println(nota20div + " nota(s) de R$ 20,00");
        System.out.println(nota10div + " nota(s) de R$ 10,00");
        System.out.println(nota5div + " nota(s) de R$ 5,00");
        System.out.println(nota2div + " nota(s) de R$ 2,00");
        System.out.println(nota1div + " nota(s) de R$ 1,00");
        
        leitor.close();
    }
}