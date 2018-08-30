import java.util.Date;

public class CadastroRevistas extends CadastroPadrao {

	private int anopub;
	private int volume;
	private String edit;
	private String assuntos;
	public CadastroRevistas(String nome, Date data, int anopub, int volume, String edit, String assuntos) {
		super(nome, data);
		this.anopub = anopub;
		this.volume = volume;
		this.edit = edit;
		this.assuntos = assuntos;
		// TODO Auto-generated constructor stub
	}
	
	public void adicionarLista(CadastroRevistas y) {
		lista.add(y);
	}


}
