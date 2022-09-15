package br.com.Rendimento;
import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
	
		
		System.out.println("Digite o Valor inicial do rendimento ");
		Double vrInicial=ler.nextDouble ();
		
		System.out.println("Digite a taxa de juros ");
		Double txJuros=ler.nextDouble ();
		
		System.out.println("Digiteo numero de meses para rendimento: ");
		int numMes =ler.nextInt();
		
		
		Rendimento r1 = new rendimento (double vrInicial, double txJuros, int numMes);
		r1.calculaRendimento
	}

}
