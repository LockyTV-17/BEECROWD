
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int valorX, valorY,min,max, valorZ=0;

        valorX = sc.nextInt();
        valorY = sc.nextInt();
        if (valorX < valorY) {
            min = valorX;
            max = valorY;
        } else {
            min = valorY;
            max = valorX;
        }
        

for (int i = min + 1; i < max; i++) {
    
    if( i % 2 !=0 ){
       valorZ = valorZ + i ;
    }
}
    System.out.printf("%d%n",valorZ);
   sc.close();
}
}
