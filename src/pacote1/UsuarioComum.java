package pacote1;
 
import java.util.List;
 
public class UsuarioComum extends Usuario {
	
	public UsuarioComum(String nome, String endereco, int idade, String telefone, Login login, List<Post> posts, ContaUsuario conta) {
		super(nome, endereco, idade, telefone, login, posts, conta);
	}
	public UsuarioComum() {
		super();
		
	}
 
}