import java.util.Scanner;
public class leitura{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int   a;
        float b;
        System.out.println("digite um valor inteiro");
        a = teclado.nextInt();
        System.out.println("digite um valor real");
        b = teclado.nextFloat();
        System.out.println("voce digitou " + a + " e " + b);
    }
}