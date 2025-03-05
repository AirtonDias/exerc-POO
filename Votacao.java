import java.util.Scanner;

public class Votacao 
{
    public static void main(String[] args) 
    {
        System.out.println("Bem vindo a votação para a Prefeitura de São Paulo.");
        System.out.println("Os candidatos e seu numero, respectivamente, são");
        Scanner input = new Scanner(System.in);

        String candidato1Nome, candidato2Nome, candidato3Nome, candidato4Nome;
        candidato1Nome = "Mônica"; candidato2Nome = "Cabolinha"; candidato3Nome = "Cascão"; candidato4Nome = "Magali";
        
        int entrada, candidato1, candidato2, candidato3, candidato4, votosBrancos;
        candidato1 = 0; candidato2 = 0; candidato3 = 0; candidato4 = 0; votosBrancos = 0;

        do 
        { 
            System.out.printf("10) %s\n20) %s\n30) %s\n40) %s\n0) Branco\n1) Nulo\n-1) Terminar votação\n", candidato1Nome, candidato2Nome, candidato3Nome, candidato4Nome);
            entrada = input.nextInt();
            switch (entrada) 
            {
                case 10: candidato1 += 1; System.out.printf("Voce votou em %s.", candidato1Nome); break;
                case 20: candidato2 += 1; System.out.printf("Voce votou em %s.", candidato2Nome); break;
                case 30: candidato3 += 1; System.out.printf("Voce votou em %s.", candidato3Nome); break;
                case 40: candidato4 += 1; System.out.printf("Voce votou em %s.", candidato4Nome); break;
                case 0: votosBrancos += 1;System.out.println("Voce votou em Branco."); break;
                case 1: System.out.println("Voce votou nulo."); break;
            
                default:System.out.println("Valor inválido! Tente novamente.");

            }


        } while (entrada != -1);

        int vencedor = Math.max(candidato1, Math.max(candidato2, Math.max(candidato3, candidato4)));
        if (vencedor == candidato1) 
        {
            System.out.printf("O candidato vencedor é %s!",candidato1Nome);
        }else
        {
            if (vencedor == candidato2) 
            {
                System.out.printf("O candidato vencedor é %s!",candidato2Nome);
            }else
            {
                if (vencedor == candidato3) 
                {
                    System.out.printf("O candidato vencedor é %s!",candidato3Nome);
                }else
                {
                    if (vencedor == candidato4) 
                    {
                        System.out.printf("O candidato vencedor é %s!",candidato4Nome);
                    }
                }
            }
        }
        System.out.println("\n\nFIM DO PROGRAMA");
    }
}
