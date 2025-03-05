import java.util.*;

public class Juros 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor capital investido: ");
        float capital = input.nextFloat();

        System.out.print("Digite a taxa de juros: ");
        float taxa = input.nextFloat();

        float rendimento;
        for (int i = 0; i < 12; i++) 
        {
            rendimento = capital * (taxa/100);
            capital += rendimento;
            System.out.printf("\nCapital após %s mês(es): R$%.2f\n", i+1, capital);

        }
    }
}
