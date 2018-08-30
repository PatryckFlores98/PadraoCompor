import java.util.Date;

public class CadastroCD extends CadastroPadrao {

	private String genero;
	private String nomemusica;
	public CadastroCD(String nome, Date data, String genero, String nomemusica) {
		super(nome, data);
		this.genero = genero;
		this.nomemusica = nomemusica;
		
		// TODO Auto-generated constructor stub
	}
	
	public void adicionarLista(CadastroCD y) {
		lista.add(y);
	}
}


