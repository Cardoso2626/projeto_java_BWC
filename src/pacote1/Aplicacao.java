package pacote1;
 
import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		
		//Criando Login e setando valores
		Login l1 = new Login();
		l1.colocaEmail(l1);
		l1.colocaSenha(l1);
		
		//Printando informações de login
		System.out.println("Email inserido: " + l1.getEmail() + "." + " " + "Senha inserida: " + l1.getSenha());
		System.out.println(" ");
		
		
		
		//Criando 2 os possíveis planos existentes
		Plano pl1 = new Plano();
		pl1.setDescricao("20 posts");
		pl1.setValor(19.99);
		Plano pl2 = new Plano();
		pl2.setDescricao("35 posts");
		pl2.setValor(29.99);
		
		//Criando ContaUsuario e setando valor
		ContaUsuario conta1 = new ContaUsuario ();
		System.out.println("Insira o valor do saldo de sua conta: ");
		double saldo = tec.nextDouble();
		conta1.setSaldo(saldo);
		
		//Criação de valores dos planos para usar no método pagarPlano
		double planoSilver = 19.99;
		double planoGold = 29.99;
				
		//Pergunta e resposta para rodar o método pagarPlano
		System.out.println(" ");
		System.out.println("Você deseja comprar um plano?(responda com 'sim' ou 'não') ");
		String resposta1 = tec.next() +tec.nextLine();
		
        //Criacão de if para método de pagarPlano
		if(resposta1.equals("sim")){
			System.out.println("Qual plano deseja? ");
			String resposta2 = tec.nextLine();
			if(resposta2.equals("Plano silver")) {
				conta1.pagarPlano(planoSilver);
				System.out.println("Seu saldo agora é: " + conta1.getSaldo());
			}else if(resposta2.equals("Plano gold")){
				conta1.pagarPlano(planoGold);
				System.out.println("Seu saldo agora é: " + conta1.getSaldo());
			}
			else {
				System.out.println("Valor inválido");
			}
			
		}else {
			System.out.println("Tudo bem!");
		}
		System.out.println(" ");
		
		
		//Aplicação do método de depósito
		System.out.println("Que tal depositar um dinheiro para comprar outro plano depois? (responda com 'sim' ou 'nao')");
		String resposta4 = tec.nextLine();
		if(resposta4.equals("sim")) {
			System.out.println("Insira o valor que você deseja depositar: ");
			double valor2 = tec.nextDouble();
			conta1.depositar(valor2);
			System.out.println("Seu saldo agora é: " + conta1.getSaldo());
		}else {
			System.out.println("Tudo bem, conte conosco se quiser");
		}
		
		
		
		//Método de feedback
		System.out.println("Está satisfeito com sua compra? ");
		String resposta3 = tec.next() + tec.nextLine();
		conta1.feedback(resposta3);
			
		
		//Criando Post e setando
		Post p1 = new Post("", LocalDate.now());
		p1.postaInfo(p1);
		p1.addPlanos(pl1);
		
		//Printando valores do post
		System.out.println("Post: " + p1.getInformacao() +  " " + "data do post: " + p1.getDataPost());
		System.out.println(" ");
		
		
		//Criando UsuarioComum
		UsuarioComum uc1 = new UsuarioComum();
		uc1.arrumaNome(uc1);
		uc1.arrumaEndereco(uc1);
		uc1.arrumaTelefone(uc1);
		uc1.arrumaIdade(uc1);
		uc1.setLogin(l1);
		uc1.addPost(p1);
		uc1.setConta(conta1);
		
		//Printando valores
		System.out.println("Nome do usuario comum: " + uc1.getNome());
		System.out.println("Endereço do usuario comum: " + uc1.getEndereco());
		System.out.println("Telefone do usuário comum: " + uc1.getTelefone());
		System.out.println("Idade do usuario comum: " + uc1.getIdade());
		System.out.println("Lista de posts do usuario comum:  " + uc1.getPosts());
		System.out.println("Saldo da conta do usuario comum: " + uc1.getConta().getSaldo());

		
		
		//Criando UsuarioParceiro
		UsuarioParceiro up1 = new UsuarioParceiro();
		up1.arrumaNome(up1);
		up1.arrumaEndereco(up1);
		up1.arrumaTelefone(up1);
		up1.arrumaIdade(up1);
		up1.setLogin(l1);
		up1.addPost(p1);
		up1.setConta(conta1);
		
		
		//Printando valores
		System.out.println("Nome do usuario parceiro: " + up1.getNome());
		System.out.println("Endereço do usuario parceiro: " + up1.getEndereco());
		System.out.println("Telefone do usuário parceiro: " + up1.getTelefone());
		System.out.println("Idade do usuario parceiro: " + up1.getIdade());
		System.out.println("Lista de posts do usuario parceiro:  " + up1.getPosts());
		System.out.println("Saldo da conta do usuario parceiro: " + up1.getConta().getSaldo());
	}
	
}