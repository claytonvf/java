import java.io.IOException;
 

import java.util.Scanner;

public class uri1011{
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        double pi, volume, r;
        r = teclado.nextDouble();
        pi = 3.14159;
        volume = 4/3.0 * pi * r*r*r;       
        System.out.printf("VOLUME = %.3f\n" , volume);
        
      
    }
 
}