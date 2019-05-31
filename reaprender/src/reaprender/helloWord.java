package reaprender;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Scanner;

public class helloWord {
	public static void main(String[] args) {

		int a;
		int b;
		int c;

		Scanner dados = new Scanner(System.in);
		
		System.out.println("informe o 1º Valor");
		a = dados.nextInt();

		System.out.println("informe o 2º Valor");
		b = dados.nextInt();
		
		System.out.println("informe o 3º Valor");
		c = dados.nextInt();	
		float total = a+b+c;
		
//		System.out.println("Hello Word");
		
		System.out.println("Os valores informado são "+ a + ", "+ b + ", " + c );
		System.out.println("A soma dos valores é "+ (a + b + c) + "");
		System.out.println("Soma dos valores da Variavel \"Total\": " + total);
		System.out.printf("Soma dos valores da Variavel \"Total\": %.2f \n", total);
		System.out.println("Fim do programa");
		System.out.println("O valor acrescentado de 1 = " + ( a + 1));
		
	}
}