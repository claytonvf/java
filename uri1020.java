
import java.util.Scanner;
public class uri1020{
     public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
       
        int N;
        int h, m, s, resto;

        N = teclado.nextInt();
        h= N / 3600;
        resto = N % 3600;

        m = resto / 60;
        s = resto % 60;

        System.out.println(h + ":" + m + ":" + s);
 
    } 
}