import java.util.Scanner;
public class imposto{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    float salBruto, salLiquido, imposto;
    salBruto =  teclado.nextFloat();
    if (salBruto <= 1000){
        imposto = 0;
    }
    else{
        if (salBruto <= 2500){
            imposto = salBruto * 12.5f / 100.0f;
        }
        else{
            if (salBruto <= 5000.0f){
            imposto = salBruto * 25.0f / 100f;
            }
            else{
                imposto = 1300.0f;
            }
        
    }    
}
System.out.println("imposto R$ "+imposto);
salLiquido = salBruto - imposto;
System.out.println("Salario liquido R$"+salLiquido);
    }
}