
import java.util.Scanner;

public class Estoque1 {

	String nome = " ";
	int qtdAtual ;
	int qtdMinima ;
	boolean flag = false;
	
	//metodo void mudarNome(String nome)
	
	public void mudarNome(String nome)
	{
		System.out.println("digite o novo produto do estoque");
		Scanner pc = new Scanner(System.in);
		nome = pc.nextLine();
	}
	
	//metodo void mudarQtdMinima(int qtdMinima)
	
	public void mudarQtdMinima(int qtdMinima)
	{
		System.out.println("digite a nova quantidade minima");
		Scanner pc = new Scanner(System.in);
		qtdMinima = pc.nextInt();
	}
	
	//metodo void repor(int qtd)
	
	public void repor(int qtd) 
	{
		qtdAtual = qtdAtual + qtd;
	}
	
	//metodo Void darBaixa(int qtd)
	
	public void darBaixa(int qtd)
	{
		qtdAtual = qtdAtual - qtd;
	}
	
	//metodo String mostra()
	
	public void mostra()
	{
		System.out.println("Você digitou  o produto  = " + nome );
		System.out.println("Você digitou  a quantidade minima  = " + qtdMinima );
		System.out.println("Você digitou  a quantidade atual  = " + qtdAtual );
		
	}
	
	//metodo Boolean precisaRepor()
	
	public void precisaRepor()
	{
		if ( qtdAtual < qtdMinima)
		{
			flag = true;
		}
		else 
		{
			flag = false;
		}
		
	}
	//------------------------------------------------------------------
	//inicia o programa
	
	public static void main(String[] args) {
		Scanner pc = new Scanner(System.in);
		String nome = " ";
		int qtdAtual ;
		int qtdMinima ;
		boolean flag = false;
		System.out.println("digite o produto do estoque");
		nome = pc.nextLine();
		
		// pergunta da quantidade atual e controla a digitação para maior que zero
		do
		{
			
		
		System.out.println("digite a quantidade atual");
		qtdAtual = pc.nextInt();
		flag = false;
		  if (qtdAtual <1)
		  {
			  flag = true;
			  System.out.println("você digitou a quiantidade atual  menor que uma unidade");
		  }
		}
		while ( flag == true);
		
		// pergunta da quantidade minima e controla a digitação para maior que zero
		do
		{
		System.out.println("digite a quantidade minima");
		qtdMinima = pc.nextInt();
		flag = false;
		if (qtdMinima < 1)
		{
			flag = true; 
			System.out.println("você digitou a quantidade minima menor que uma unidade");
		}
		}
		while (flag == true);
		
		
		// informa o que foi digitado ate o momento
		
		
		System.out.println("Você digitou  o produto  = " + nome );
		System.out.println("Você digitou  a quantidade atual  = " + qtdAtual );
		System.out.println("Você digitou  a quantidade minima  = " + qtdMinima );
		
		// usando o metodo de repor
		
		//System.out.println("digite a quantidade que quer repor = somando o que já tem");
		//qtdAtual = pc.nextInt();
		//qtdAtual = repor(2);
		
	}
	
	
	

}
