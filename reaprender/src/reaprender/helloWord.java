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
		
		System.out.println("informe o 1� Valor");
		a = dados.nextInt();

		System.out.println("informe o 2� Valor");
		b = dados.nextInt();
		
		System.out.println("informe o 3� Valor");
		c = dados.nextInt();	
		float total = a+b+c;
		
//		System.out.println("Hello Word");
		
		System.out.println("Os valores informado s�o "+ a + ", "+ b + ", " + c );
		System.out.println("A soma dos valores � "+ (a + b + c) + "");
		System.out.println("Soma dos valores da Variavel \"Total\": " + total);
		System.out.printf("Soma dos valores da Variavel \"Total\": %.2f \n", total);
		System.out.println("Fim do programa");
		System.out.println("O valor acrescentado de 1 = " + ( a + 1));
		
	}
}