package pacote1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private String endereco;
	private int idade;
	private String telefone;
	private Login login;
	private List<Post> posts;
	private ContaUsuario conta;

	public Usuario() {
	}

	public Usuario(String nome, String endereco, int idade, String telefone, Login login, List<Post> posts, ContaUsuario conta) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.telefone = telefone;
		this.login = login;
		this.posts = posts;
		this.conta = conta;
	}
	
	

	public ContaUsuario getConta() {
		return conta;
	}

	public void setConta(ContaUsuario conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
    
	
	
	//Método de criação da lista posts
	public void addPost(Post p1) {
		if(this.posts == null) {
			this.posts = new ArrayList<>();
		}
		posts.add(p1);
		
	}
	
    //Criação de métodos que setam valores de nome, endereço, telefone e idade. CONTROLE DO USUARIO
	public void arrumaNome(Usuario u1) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Insira seu nome: ");
		String nome = tec.next() + tec.nextLine();
		u1.setNome(nome);
	}

	public void arrumaEndereco(Usuario u1) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Insira seu endereço: ");
		String endereco = tec.nextLine();
		u1.setEndereco(nome);
	}
	public void arrumaTelefone(Usuario u1) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Insira seu telefone: ");
		String telefone = tec.nextLine();
		u1.setTelefone(telefone);
	}
	public void arrumaIdade(Usuario u1) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Insira sua idade: ");
		int idade = tec.nextInt();
		u1.setIdade(idade);
	}




}