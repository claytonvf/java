import java.io.IOException;
 

import java.util.Scanner;

public class uri1008{
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int num, qtd;
        float valorH;

        float total;

        num = teclado.nextInt();
        qtd = teclado.nextInt();
        valorH = teclado.nextFloat();

        total = valorH * qtd;


        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n",total);

 
    }
 
}