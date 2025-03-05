import java.util.*;

public class Aniversario
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma data de aniversario no formato XX/XX/XXXX: ");
        String entrada;
        entrada = input.nextLine();
        
        entrada = entrada.replace("/", "");
        int entradaInt = Integer.parseInt(entrada);
        int metade1, metade2;

        metade1 = entradaInt % 10000;
        metade2 = entradaInt - metade1;
        metade2 = metade2 / 10000;


        int soma = metade1 + metade2;
        int soma1 = soma % 100;
        int soma2 = soma - soma1;
        soma2 = soma2 / 100;

        int perfil = soma1 + soma2;
        perfil = perfil % 5;
        switch(perfil)
        {
            case 0:System.out.println("Perfil Timido");break;
            case 1:System.out.println("Perfil Sonhador");break;
            case 2:System.out.println("Perfil Paquerador");break;
            case 3:System.out.println("Perfil Atrante");break;
            case 4:System.out.println("Irresistivel");break;
        }
    }; 
};