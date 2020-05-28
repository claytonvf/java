import java.util.Scanner;
public class lendosempre{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero;
        numero = teclado.nextInt();
        
        while (numero != -1){
            System.out.println("numero lido ="+numero);
            numero = teclado.nextInt();
            
        }
    }
}