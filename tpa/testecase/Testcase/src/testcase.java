import java.util.Scanner;
public class testcase {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int p;
		
		System.out.println("escreva o ultimo nunero da placa do seu carro");
		p = ler.nextInt();
		
		switch(p) {
		case 1:
		case 2:
		   System.out.println("Não pode andar de segunda");
		   break;
		case 3:
		case 4:
			System.out.println("Não pode andar de terça");
			break;
		case 5:
		case 6:
			System.out.println("Não pode andar de quarta");
			break;
		case 7:
		case 8:
			System.out.println("Não pode andar de quinta");
			break;
		case 9:
		case 0:
			System.out.println("Não pode andar de sexta");
			break;
		default:
			System.out.println("Número invalido");
			
			
		}
		ler.close();
	}

}
