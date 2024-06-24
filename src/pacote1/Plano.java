package pacote1;

public class Plano {
	private String descricao;
	private double valor;
	
	public Plano() {
		
	}

	public Plano(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	//Método para printar valores na lista de forma correta
	public String toString() {
		return "Descrição do possível plano que pode ser comprado, quando o seu finalizar ou quando quiser comprar pela primeira vez " + descricao + " " + "valor do plano: " + valor;
	}
	

}
