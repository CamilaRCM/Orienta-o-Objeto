package br.com.Rendimento;

public class E2 {
	private double investInicial;
	private double taxaRendimento;
	private int numMeses;
	
	public void rendimento (double investInicial, double taxaRendimento, int numMeses ) {
		
		this.investInicial= investInicial;
		this.taxaRendimento = taxaRendimento;
		this.numMeses = numMeses;		
			
		}
	
		
		public double getInvestInicial() {
		return investInicial;
	}



	public void setInvestInicial(double investInicial) {
		this.investInicial = investInicial;
	}



	public double getTaxaInvestimento() {
		return taxaRendimento;
	}


	public void setTaxaInvestimento(double taxaInvestimento) {
		this.taxaRendimento = taxaInvestimento;
	}



	public int getNumMeses() {
		return numMeses;
	}



	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}

		public void calculaRendimento () {
			Double rendimentoMes; 
			
			rendimentoMes=getInvestInicial (); 
			
			for (int i=0; i<getNumMeses();i++)
			{
			
				rendimentoMes=rendimentoMes*gettaxaRendimento)/100+rendimentoMes;
			
			System.out.printf ("mes %d: %.2f\n", (i+1),rendimentoMes);
		}
			
		}	


