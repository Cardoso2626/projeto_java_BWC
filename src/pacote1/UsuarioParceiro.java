package pacote1;
 
import java.util.List;
 
public class UsuarioParceiro extends Usuario{
	
	
	public UsuarioParceiro(String nome, String endereco, int idade, String telefone, Login login, List<Post> posts, ContaUsuario conta) {
		super(nome, endereco, idade, telefone, login, posts, conta);
	}
 
	public UsuarioParceiro(){
		super();
		
	}
	
 
}
 