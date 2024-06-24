package pacote1;
import java.util.Scanner;
 
public class Login {
	private String email;
	private String senha;
	
	
	public Login(){
	}
 
	public Login(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
 
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
 
	public String getSenha() {
		return senha;
	}
 
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	//Métodos que setam email e senha do usuario. CONTROLE DO USUARIO
	public void colocaEmail(Login l1) {
		Scanner tec = new Scanner (System.in);
		System.out.println("Coloque o email que deseja: ");
		String email = tec.nextLine();
		l1.setEmail(email);
	}
	
	public void colocaSenha(Login l1) {
		Scanner tec = new Scanner (System.in);
		System.out.println("Coloque a senha que deseja: ");
		String senha = tec.nextLine();
		l1.setSenha(senha);
	}
	
   
	
}
 