import java.util.ArrayList;
import java.util.Date;


public class CadastroPadrao {

	private String nome;
	private Date data;
	ArrayList<CadastroPadrao> lista;
	public CadastroPadrao(String nome, Date data){
		this.nome=nome;
		this.data=data;
	}



	public void adicionarlista(CadastroPadrao x) {
		lista.add(x);
	}




}
