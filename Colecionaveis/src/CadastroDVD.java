import java.util.Date;

public class CadastroDVD extends CadastroPadrao {

	private String tipo;
	private String descricao;
	public CadastroDVD(String nome, Date data, String tipo, String descricao) {
		super(nome, data);
		this.tipo = tipo;
		this.descricao = descricao;
		// TODO Auto-generated constructor stub
	}
	
	public void adicionarLista(CadastroDVD y) {
		lista.add(y);
	}


}
