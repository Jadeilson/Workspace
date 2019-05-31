package br.com.reaprender.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

import org.omg.PortableInterceptor.USER_EXCEPTION;

public class GravaArquivos {
	
	public static void main(String[] args) throws IOException {
	
	int valorA;
	int valorB;
	String nome;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("informe o primeiro Valor");
	valorA = ler.nextInt();
	
	System.out.println("informe o segundo Valor");
	valorB = ler.nextInt();
	
	ler.nextLine(); // Zerar o Buffer do dados
	
	System.out.println("informe o seu nome");
	nome = ler.nextLine();

	/*
	 * Para o metodo -> New FileWriter o arquivo ser� criado, ou sobreposto caso j� exista
	 * 
	 * Para adicionar texto ao final do Arquivo � necess�rio ter a express�o boeana "True"
	 * 
	 */	
	
	BufferedWriter bw = null; // Aloca um espa�o de Buffer vazio
	bw = new BufferedWriter(new FileWriter("C:\\Users\\Jadeilson\\Desktop\\teste.txt",true)); //Se o arquivo existir carrega em buffer, caso n�o exista cria o arquivo.
	bw.newLine(); // Adiciona uma quebra de linha ao final do arquivo.
	bw.write("Teste Final do Arquivo"); // Adiciona texto ao Arquivo.
	bw.flush(); // Limpa o buffer da memoria.
	bw.close(); // Fecha\Grava o arquivo com os dados adicionados

//	FileWriter arquivo = new FileWriter("C:\\Users\\Jadeilson\\Desktop\\teste.txt");

	
	/*
	PrintWriter gravarArq = new PrintWriter(arquivo);	
	
	gravarArq.println("\nvalor de A: " + valorA);
	gravarArq.println("\nvalor de A: " + valorB);
	gravarArq.println("\nvalor de A: " + nome);
	
	arquivo.close(); // Fechamento do arquivo com os dados Gravados.
	
	*/
	
	String usuario = System.getProperty("user.name");
	String homeUsuario = System.getProperty("user.home");
	String userDir = System.getProperty("user.dir");
	String osName	=	System.clearProperty("os.name");
	String osArch	=	System.clearProperty("os.arch");
	String osVersion	=	System.getProperty("os.version");
	String lineSeparator	=	System.getProperty("line.separator"); 
	
	System.out.println("propriedades do sistema: ");
	
	/*
	System.out.println("arquivo gravado com os valores abaixo");
	System.out.println("\n valor de A: " + valorA);
	System.out.println("\n valor de A: " + valorB);
	System.out.println("\n Valor do Nome: " + nome);
	System.out.println("\n Fim do programa");	
	*/
	
	System.out.println("Nome do usu�rio do sistema: " + usuario);
	System.out.println("Home do Usu�rio do sistema: " + homeUsuario);
	System.out.println("Diret�rio atual do usu�rio: " + userDir);
	System.out.println("Sistema Operacioanl: " + osName);
	System.out.println("Arquitetura do S.O: " + osArch);
	System.out.println("Vers�o do S.O: " + osVersion);
	System.out.println("Tipo de separador de linha: " + lineSeparator);
	
	
	}
}
