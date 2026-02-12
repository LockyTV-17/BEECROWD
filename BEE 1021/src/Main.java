
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int  day = sc.nextInt(); 

       int year = day/365;
       int mes = (day%365)/30; 
       int days = (day%365)%30; 
       System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", year,mes,days);
    }
}
