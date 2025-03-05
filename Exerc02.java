import java.util.Scanner;


public class Exerc02
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int tempF;
        int tempC;

        System.out.print("Digite uma temperatura: ");
        tempF = input.nextInt();
        
        tempC = (tempF - 32) * 5 / 9;
        System.out.printf("Temperatura em %dºC", tempC);
    }
}