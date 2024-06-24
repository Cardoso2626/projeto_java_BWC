package pacote1;
 
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Post {

	private String informacao;
	private LocalDate dataPost;
	private List<Plano> planos;

	public Post(){
	}
	
	
	
 
	

	public List<Plano> getPlanos() {
		return planos;
	}






	public void setPlanos(List<Plano> planos) {
		this.planos = planos;
	}






	public Post(String informacao, LocalDate dataPost) {
		super();
		this.informacao = informacao;
		this.dataPost = dataPost;
	}
 
 
	public String getInformacao() {
		return informacao;
	}
 
 
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
 
 
	public LocalDate getDataPost() {
		return dataPost;
	}
 
 
	public void setDataPost(LocalDate dataPost) {
		this.dataPost = dataPost;
	}
 
	//Método para printar valores na lista de forma correta
	public String toString(){
		return "Informação postada: " + informacao + " " + "Data de post: " + dataPost + " " + "Planos: " + planos; 
	}
	
	
    //Método que seta informação do post. CONTROLE DO USUARIO
	public void postaInfo(Post p1) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Insira o post que deseja fazer");
		String post = tec.nextLine();
		p1.setInformacao(post);
	}
	
	
	//Criação da lista planos
	public void addPlanos(Plano pl1) {
		if(this.planos == null) {
			this.planos = new ArrayList <>();
		}
		planos.add(pl1);
		
	}

 
}
