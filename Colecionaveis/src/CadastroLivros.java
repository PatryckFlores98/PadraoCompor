import java.util.Date;

public class CadastroLivros extends CadastroPadrao {

	private String editora;
	private int anopublicacao;
	public CadastroLivros(String nome, Date data, String editora, int anopublicacao) {
	
		super(nome,data);
		this.editora = editora;
		this.anopublicacao = anopublicacao;	
	}
	
	public void adicionarLista(CadastroLivros y) {
			lista.add(y);
		}
	}


