import java.io.IOException;
 

import java.util.Scanner;

public class uri1004{
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
       
        int A, B, prod;
        A = teclado.nextInt();
        B = teclado.nextInt();
        prod = A * B;

        System.out.println("Prod = "+prod);
 
    } 
}