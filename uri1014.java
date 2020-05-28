
import java.util.Scanner;
public class uri1014{
     public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
       
        int X;
        float Y;
        float consumo;

        X = teclado.nextInt();
        Y = teclado.nextFloat();
        consumo = X / Y;

        System.out.printf("%.3f km/l\n", consumo);
 
    } 
}