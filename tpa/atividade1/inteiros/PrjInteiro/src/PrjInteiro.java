import java.util.Scanner;
  
  public class PrjInteiro {
  public static void main (String args[]) {
	  Scanner ler = new Scanner (System.in);
	  int a, b, c;
	  
	 System.out.println("digite o primeiro numero inteiro (a)");
	 a = ler .nextInt();
	 
	 System.out.println("digite o segundo numero inteiro(b)"); 
   b = ler .nextInt();
   
	  c = a;
	  a = b;
	  b = c;
	  
    System.out.println("seus numeros são:" + a + "e" + b);
	  ler.close();
	  
}
}