import java.io.IOException;
 

import java.util.Scanner;

public class uri1019{
 
    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);
        
        int secs, s, h, m, r;
        secs = teclado.nextInt();
        h = secs / 3600;
        r = secs % 3600;
        m = r / 60;
        secs = r % 60;        
     
        System.out.println( h+":" +m+ ":" +secs);

    }
 
}