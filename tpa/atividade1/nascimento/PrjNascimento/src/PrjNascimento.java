import java.util.Scanner;

public class PrjNascimento {
public static void main (String args[]) {
	Scanner ler= new Scanner(System. in);
	int anoNascimento, anoAtual, idade;
	System.out.println("Digite o ano que você nasceu");
	anoNascimento = ler.nextInt();
	
	System.out.println("Digite o ano atual");
    anoAtual = ler.nextInt();
    
    idade= anoAtual-anoNascimento;
    
    System.out.println("Sua idade é:" + idade);
    ler.close();
  }
}

