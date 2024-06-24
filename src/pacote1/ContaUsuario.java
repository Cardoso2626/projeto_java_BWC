package pacote1;

public class ContaUsuario {
	private double saldo;

	public ContaUsuario(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public ContaUsuario() {
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean pagarPlano(double valor) {
		if(saldo > valor) {
			System.out.println("Compra concluída com sucesso");
			saldo = saldo - valor;
		}
		return true;
	}
	
	public String feedback(String resposta){
	    if (resposta.equals("sim")) {
	        return "Muito obrigado pelo feedback!";
	    }
	    return "Muito obrigado pelo feedback!";
	}
	
	//Método de depósito
	public void depositar(double valor) {
        saldo = saldo + valor;
	}


}